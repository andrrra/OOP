package week5ObjectsAndDataTypes;

import java.awt.*;

public class Voronoi {

    public static double pointDist(Point2D point1, Point2D point2) {
    	int x1=point1.getX();
    	int x2=point2.getX();
    	int y1=point1.getY();
    	int y2=point2.getY();
    	return Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
    	
    }

    public static int findClosestPoint(Point2D point, Point2D[] sites) {
      double min = Double.MAX_VALUE;
      int index=0;
      for (int i=0;i<sites.length;i++){
    	  if (pointDist (point, sites[i])<min) {
    		  min = pointDist(point, sites[i]);
    		  index = i;
    	  }
      }
      return index;
    }

    public static int[][] buildVoronoiMap(Point2D[] sites, int width, int height) {
       int [][] indexmap = new int[width][height];
       for (int i=0;i<width;i++)
    	   for(int j = 0;j<height;j++) {
    		   Point2D p = new Point2D(i,j);
    		   indexmap[i][j] = findClosestPoint(p, sites);
    	   }
       return indexmap;
    }

    public static void plotVoronoiMap(Point2D[] sites, Color[] colors, int[][] indexMap) {
    	int width = indexMap.length;
    	int height = indexMap[0].length;

    	StdDraw.setCanvasSize(width, height);
    	StdDraw.setXscale(0, width);
    	StdDraw.setYscale(0, height);
    	
    	for(int i=0;i<width;i++)
    		for(int j=0;j<height;j++) {
    			StdDraw.setPenColor(colors[indexMap[i][j]]);
    			StdDraw.point(i, j);
    		}
    	StdDraw.setPenColor(Color.BLACK);
    	for (int i=0;i<sites.length;i++)
    		StdDraw.filledCircle(sites[i].getX(), sites[i].getY(), 3);
    		
    }

    public static void main(String[] args) {
        int width = 200;
        int height = 200;

        int nSites = 5;
        Point2D[] sites = new Point2D[nSites];
        sites[0] = new Point2D(50, 50);
        sites[1] = new Point2D(100, 50);
        sites[2] = new Point2D(50, 100);
        sites[3] = new Point2D(125, 50);
        sites[4] = new Point2D(100, 175);

        Color[] colors = new Color[nSites];
        colors[0] = Color.BLUE;
        colors[1] = Color.GREEN;
        colors[2] = Color.YELLOW;
        colors[3] = Color.ORANGE;
        colors[4] = Color.MAGENTA;

        int[][] indexmap = buildVoronoiMap(sites, width, height);
        plotVoronoiMap(sites, colors, indexmap);

    }

}
