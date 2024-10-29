public RecordCircle {
    int x;
    int y;
    int radius;
    public RecordCircle(int x,int y, int radius){
        this.x = x;
        this.y=y;
        this.radius = radius;
    }
    public int Area(){
        return Math.PI*radius*radius;

    }
}

    public static void main(String[] args) {
        RecordCircle rc = new RecordCircle(54,68,4);
        System.out.println(rc.toString());
    }
}