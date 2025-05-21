package com.znaji.chapter7.enums;

public enum Season implements Weather{ //public or package
    SUMMER("high") {
        @Override
        public int getWorkingHours() {
            return 10;
        }

        @Override
        public double avgTemp() {
            return 33.5;
        }
    }, FALL("medium") {
        @Override
        public int getWorkingHours() {
            return 6;
        }
    }, WINTER("low") {
        @Override
        public int getWorkingHours() {
            return 3;
        }
    }, SPRING("medium") {
        @Override
        public int getWorkingHours() {
            return 5;
        }
    };
    private final String numOfVisitors;
    private Season(String numOfVisitors) {
        this.numOfVisitors = numOfVisitors;
        System.out.println(this.name() + " created" );
    }

    public String getNumOfVisitors() {
        return numOfVisitors;
    }

    public abstract int getWorkingHours();

    public double avgTemp() {
        return 25.0;
    }
}

//enum ExtendedSeason extends Season {} enums can't be extended
