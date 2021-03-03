
class Twh
{
    void towerofhanoi(int n,char from_rod,char to_rod,char aux_rod)
    {
        if(n==0)
            return;
        towerofhanoi(n-1,from_rod,aux_rod,to_rod);
        System.out.println("Move Disk"+"  "+ n+"  "+ "from_rod"+"  "+"aux_rod"+"  "+"to_rod" );
        towerofhanoi(n-1,aux_rod,to_rod,from_rod);
    }
}
class Main{
    // Driver method to test above
    public static void main(String []args)
    {
        Twh ob = new Twh();
        ob.towerofhanoi(3,'A','B','C');
    }
}
