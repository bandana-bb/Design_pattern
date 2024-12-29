package dev.bandana.design_pattern;


public class Student {
    private String name;
    private int age;
    private String batch;
    private double psp;
    private int grandyear;


    private  Student(Builder builder) {
        if(builder.getGrandyear() > 2024) {
           throw new RuntimeException("Grandyear should not be greater than 2024");
        }
    }


    public static Builder getBuilder() {
        return  new Builder();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public int getGrandyear() {
        return grandyear;
    }

    public void setGrandyear(int grandyear) {
        this.grandyear = grandyear;
    }

     static class Builder {
        private String name;
        private int age;
        private String batch;
        private double psp;
        private int grandyear;


         public Student build() {
             return new Student(this);
         }
        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public int getGrandyear() {
            return grandyear;
        }

        public Builder setGrandyear(int grandyear) {
            this.grandyear = grandyear;
            return this;
        }
    }
}
