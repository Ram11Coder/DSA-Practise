# Math topics

### Modular arithmetic

The remainder obtained after the division operation on two operands in knowns modular operation

if N then cycle will be 0 - N-1
example N=5 then 0-4 is a possible cycle


Modulo uses various competitive programming scenerios
1.Find the last digit of number
2.Palindrome
3.Armstrong
4.Integeroverflow


some times we dea with numbers which is larger than long, go with modulo operations
CP uses 

10^9+7 -> it is integer , prime ,first 10 digit
why this number?
repetetion is less 


### Distributive properties
-----------------------
(a+b)%m = ((a%m)+(b%m))%m
(a-b)%m = ((a%m)-(b%m))%m
(a*b)%m = ((a%m)*(b%m))%m



### Modular division
(a/b)%m =((a%m)*(b^-1&m))%m

b^-1 -> modular multiplicative inverse

Used in combinations


what is inverse?
Y is inverse of x, if x*y=1. y=1/x;
All real numbers other than 0 have an inverse

What is Modular multiplicative inverse?
A MMI of an integer 'A' is integer 'X', such that the product A*X=1(mod m)

Formula :(A*X)%m = 1

example:
A=3,M=7
X= 0 to M-1
(3*5)%7=1

so X is MMI of A with respect to M


For different number of M we will get different MMI(X) of same number(A)

Question
Can we find MMI of all numbers?
Just see example 
A=4, M=2 -> no MMI exist

Before checking MMI, it show satisfy the below property
gcd(A,M)=1

A,M are co-primes


X is a MMI of A



Approach:
1. Naive approach
2. Eucledean algorithm
extended euclidean algo

formula
Ax+By=gcd(A,B)

gcd(A,M)=1

Ax+My=1
mod both side

Ax%M+My%M=mod M

My%M=0

Ax%M=mod M


x-> MMI

Modular division can not occur directly we need to find MMI to find modular division


### Modular Exponentiation

(a^b)%m

if b is even then 

(a^b)%m -> (a^(b/2)*a^(b/2)) mod m
       
 = ((a^(b/2)mod m)*(a^(b/2)mod m ))) mod m
  
  we dividing the equation again and again, here used as recursion
  
  base condition a=0  -> 0
       			 b=0  -> 1
   
if b is odd then 

(a^b)%m -> (a^(b)*a^(b-1)) mod m
       
 = ((a^(b)mod m)*(a^(b-1)mod m ))) mod m
  
  here = b-1 -> even , repeation of even number
  
  we dividing the equation again and again, here used as recursion
  
  base condition a=0  -> 0
       			 b=0  -> 1 