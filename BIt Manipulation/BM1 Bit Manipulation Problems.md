**Agenda Bit Manipulation**
1. Binary to Number Conversion (1's and 2's Compliment)
2. Operators (AND, OR, XOR, NOT, LEFT SHIFT, RIGHT SHIFT)
3. Swap two Numbers
4. Check the ith bit is set or not
5. Extract the ith bit
6. Set the ith bit
7. Clear the ith bit
8. Toggle the ith bit


1. Binary to Number Conversion

Number to Binary Conversion
(7)<sub>10<sub>

2 | 7   1 <br>
2 | 3   1  <br>
  | 1       <br>


Write from the bottom to top reminders values
The binary value of the number is 7. is (111)<sub>10<sub>


Binary to Number
(1101)<sub>2<sub>

=1 x 2<sup>3 + 1 x 2<sup>2 +0 x 2<sup>1 +1 x 2<sup>0
= 1 x 8 + 1 x 4 + 0 x 2 + 1 x 1
= 8 + 4 + 0 + 1
= 13
the number is (13)<sub>10



Code:
Function that takes the decimal number and give the binary
sol:

```c++
string covert2Binary(int n) {
    string res =""
    while(n!=1) {
       if(n%2==1) {
        res +='1';
       }else {
        res+='0';
       }
        n =n/2;
    }
    reverse(res);
}

#Time complexity O(logn)
#Space complexity O(1)

```

Function to convert the binary to number
```c++
int convertBinary(string s) {
    int len = s.length;
    int num =0;
    int p2 =1;
    for(int i=len-1;i>0;i--) {
      if(x[i]=='1') {
        num+=p2;
      }
      p2= p2*2;
    }
    return num;
      }

#Time complexity O(n)
#Space complexity O(1)

```


The number Stored in memory as 
lets say 
int number =13
000... 00000 1 1 0 1  - 32 bit (4 bit number here )

int - 32 bit
long long -64


**1's and 2's Compliment**

1s Compliment:
(13) ---(1101) - (0010)
Decimal---- binary - flip the binary numbers

2s Compliment
Steps : 1. Convert the number to 1s Compliment
        2. Add 1 to the binary 1s Compliment 
(13) ---(1101) - (0010)-- add 1 - (0011)



**2 Operators**

1. AND Operator :
All True Means true, One False is False
example :  x = 13 & 7
13  --- 1 1 0 1     
7   --- 0 1 1 1     
        --------        
13 & 7 - 0 1 0 1            


2. OR Operator :
One True Means True, All False is False
example :  x = 13 | 7
13  --- 1 1 0 1     
7   --- 0 1 1 1     
        --------        
13 | 7 - 1 1 1 1   


3. XOR Operator :
No of ones are Odd then 1
No of Ones are Even then 0
(or)
Same means 0 -- 1 1 =0 or 0 0 =1
Different means 1 

example :  x = 13 ^ 7
13  --- 1 1 0 1     
7   --- 0 1 1 1     
        --------        
13 ^ 7 - 1 0 1 0      


4. Shift Right Operator(>>) :

Shift the Bits one place right and remove the last bit
Note : After the shift the actual number is divied by 2 
example :  x = 13 >> 1
13  --- 1 1 0 1       = 13
13 >> 1 --- 0 1 1 0   = 6

Here 13/2 = 6  remove the reminder

Example 2 :  x >> = (x/ 2<sup>k<sup>)
Example 3 : x= -13
The Computer store the -13 in 2s compliment and apply the shift value on it and after applying 

for number we need to take the 2's complement on the binary 2's complement of the negative number then we get the posiitive and apply the (-) symbol on it

In 32 bits integer
First Bit 0 - positive number
First Bit 1 - negative number 
It is called the Sign Bit

In 32 Bit values the numbers range is
-2147483648 to 2147483647  i.e -2<sup>31</sup> - Integer Negative
2<sup>-31 -1 - Integer Max



5. Shift Left Operator(<<) :

Shift the Bits one place left and add 0 at the last

Example:  x = 13 << 1
13 --- 1 1 0 1   = 13
13 << 1  ---  1 1 0 1 0 = 23

x << k = x * 2<sup>k<sup>

(2<sup>31<sup> -1) << 1  = OverFlow


6. Not Operator (~)
 *It will Flip all the number
 * After the Flip it will check if the number is Postive or negative 
 if it is negative it will take the 2s compliment
 if it is posivie it will stop at only flip

 



















