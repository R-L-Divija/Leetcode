char* triangleType(int* a, int n) {
 if(a[0]+a[1]<=a[2]||a[0]+a[2]<=a[1]||a[2]+a[1]<=a[0]) return "none";
   if(a[0]==a[1]&& a[1]==a[2]) return "equilateral";
   if((a[0]==a[1])|| (a[0]==a[2])||(a[1]==a[2])) return "isosceles";
  return "scalene";

}