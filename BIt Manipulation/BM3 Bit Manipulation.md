**1. Check if the ith Bit is Set to 1 or not**

**In this you are given the Number n = number You are given the value i =bit position Check of the 2nd Bit in the Number is Set to 1 or not**

Example n =13 , i=2
13 --- (1 1 0 1)<sub>2<sub>
Check if the Second bit from the end is set to 1 or not

Brute Force Method:
1. Convert the Number into the binary String 
2. Loop through the string and check the second bit is 1 if yes return true else false
3. Time Complexity O(n)
4. Space Complexity O(1)

Using Bits

1. Using Left Shift Operator

N =13, i =2
13  --- 1 1 0 1
1 << i = 1 << 2 --- 1
                  1 0
                1 0 0
                    

         1 1 0 1        
         & 1 0 0        
-----------------       
     0 0 0 1 0 0            

if the number is greater then 0 it is set else it is not set because if it is zero it is not set

if((N & (i << 1))!=0) return true else false

2. Right Shift Operator

Here we need check the second bit value so we take the second bit value to extreme left and check of the number last bit is set to one or not if yes right yes else false

Note : if the last bit is 1 it is Odd number
to check if the last bit set to one we do
 n & 1 = 1 it means it set else not set

N =13 i=1
13 >> 2 = 1 1 0 1       
          0 1 1 0       

if the last bit is set or not so i=1 is not set

Code :
if((N >> i) & 1 == 0 )
return false
else
return true


**2. Set the ith Bit  of the  Number(n) to 1**

**In this you are given the Number n = number You are given the value i =bit position  we need to set the ith bit to 1**

Note: if the ith bit is already one it after setting it will not change     


Sol:
We need to place the One at the ith postition that is       
1<< i = 1 << 2 --- 1        
                  1 0       
                1 0 0       
                    

Example:  N =9 i=2      
9 --- 1 0 0 1       
        1 0 0       
      -------       
 |(OR)1 1 0 1       

 i.e 
 N = N | (i << i)       


 **3. Clear the ith Bit  of the  Number(n) to 0**

**In this you are given the Number n = number You are given the value i =bit position  we need to Clear the ith bit to 0**

Example: N=13 , i=2
13 --- 1 1 0 1

We need to clear the ith bit here it is 1 we need to make it the 0
So, we place the 0 in that position and all the remaining places will remain  to 1
~(1 << i) --- 1         
            1 0         
           1 0 0            
           0 1 1            

    1 1 0 1         
 &  1 0 1 1         
------------            
    1 0 0 1         

N = N & ~(i << i )



 **4. Toggle the ith Bit  of the  Number(n) **

**In this you are given the Number n = number You are given the value i =bit position  we need to Toggle the ith bit**

Example N =13, i =2
13 --- 1 1 0 1

Place the 1 in that place and do the XOR
1 << i = 1 << 2 --- 1       
                  1 0       
                1 0 0       
                    

13  --- 1 1 0 1     
^(XOR)    1 0 0     
----------------
        1 0 1 1     



 **5. Removing the Last Set Bit(Right Most)**

**In this you are given the Number n = number
we need to reomve the right Most set Bit**

Example N =12

12  ---- 1 1 0 0
         1 0 0 0


N =N & N-1  (It is used to clear the last set Bit)
12 = 1 1 0 0    
11 = 1 0 1 1    
 &  --------    
     0 1 0 0    


**6 Check if the Number is Power of the 2**

N = 8 -- 1 0 0 0    
N = 7 -- 0 1 1 1   
&    --------------     
         0 0 0 0   

if(N & N-1 ==0)return true else false



**7.Count the Number of Set Bits**

int count(int n) {
    int count =0;
    while(n>1) {
        count += n & 1;
        n = n >> 1;
    }
    return count;
    }
}

n & 1 is Odd Check 



Alternative (we will Turn off right most bit one by one )

int count =0;
while(n!=0) {
    n = n &(n-1);
    count++;

}

Time Complexity - O(No of Set Bit)











