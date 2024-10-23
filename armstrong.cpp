#include<iostream>
#include<math.h>
using namespace std;
int main(){
    int n;
    int a , b ,c ,i;
    cout<<"Enter a number "<<endl;
    cin>>n;
    for ( i = 1; i < 100; i++)
    {   
        cout<<"Enter the numbers  present in your number"<<endl;
        cin>>a>>b>>c;
        int  value = ((a*a*a)+(b*b*b)+(c*c*c));
        if(value == n){
            cout<<"the given number is Armstrong :"<<n;
            break;
        }
        else{
            cout<<"this number is not armstong:"<<n<<endl;
            break;
        } /* code */
    }
    
}

