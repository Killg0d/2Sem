//tarun
//230970005
//12-02-24
#include<iostream>
#include<stack>
#include<cstring>
using namespace std;

double evaluate(char* prefix)
{
stack<double> s;
        for(int i=strlen(prefix)-1;i>=0;i--)
        {
                if (prefix[i]==' ')
                        continue;
                if(isdigit(prefix[i]))
                {
                        double num =0,j=i;
                        while(i>=0 && isdigit(prefix[i]))
                                i--;
                        i++;
                        for(int k=i;k<= j; k++)
                                num=num*10+(prefix[k]-'0');
                        s.push(num);
                }
                else
                {
                        double op1=s.top();
                        s.pop();

                        double op2=s.top();
                        s.pop();
                double v;
                        switch(prefix[i])
                        {
                                case '^':s.push((int)op1^(int)op2);
                                        break;
                                case '*':s.push(v=op1*op2);

                                        break;
                                case '/':s.push(v=op1/op2);
                                        break;
                                case '+':s.push(v=op1+op2);
				                                        break;
                                case '-':s.push(v=op1-op2);
                                        break;
                                case '%':s.push((int)op1%(int)op2);
                                        break;
                        }


                }
}
return s.top();
}
int main()
{
        char ch[]="/ * + 300 23 - 43 21 + 84 7";
        //cout<<"Enter expr:";
        //cin.getline(ch,50);
        cout<<evaluate(ch);
        cout<<endl;
return 0;
}
