package logic;

public enum Operator {

    AND {
        @Override
        public String toString() {
            return "&";
        }
    },

    OR {
        @Override
        public String toString() {
            return "|";
        }
    },

    IF {
        @Override
        public String toString() {
            return "->";
        }
    },

    NEG {
        @Override
        public String toString() {
            return "~";
        }
    }

}