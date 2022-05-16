class Hospital
{
 int getNumberofPatients()
 {
  return 0;
 }
}
class ColumbiaAsia extends Hospital 
{
  int getNumberofPatients()
 {
  return 1657;
 }
}
class Manipal extends Hospital 
{
  int getNumberofPatients()
 {
  return 2965;
 }
}
class Apollo extends Hospital
{
  int getNumberofPatients()
 {
  return 1631;
 }
}
class Main
{
 public static void main(String args[])
 {
  ColumbiaAsia columbiaasia = new ColumbiaAsia();
  Manipal manipal = new Manipal();
  Apollo apollo = new Apollo();
  int ColumbiaPatients = columbiaasia.getNumberofPatients();
  int ApolloPatients = apollo.getNumberofPatients();
  int ManipalPatients = manipal.getNumberofPatients();
  System.out.println("Total patients from Columbia Asia Hospital: "+ColumbiaPatients);
  System.out.println("Total patients from Manipal Hospital: "+ManipalPatients);
  System.out.println("Total patients from Apollo Hospital: "+ApolloPatients);
 }
}