#include<iostream>
using namespace std;
struct poly
{
        int coef,expo;
};
int main()
{
        int terms;
        //Read first polynomial
        cout<<"\nEnter polynomial 1:";
        cout<<"\nEnter number of terms:";
        cin>>terms;
        poly p1[terms+1];
        p1[0].coef=terms;
        for(int i=1;i<=p1[0].coef;i++)
        {
                cout<<"\nEnter the coefficient:";
                cin>>p1[i].coef;
                cout<<"\nEnter the exponent:";
                cin>>p1[i].expo;
        }
        cout<<"\nThe first polynomial is: ";
        for(int i=1;i<=p1[0].coef;i++)
        {
                cout<<p1[i].coef<<"x^"<<p1[i].expo<<"+";
        }
        //Read 2nd polynomial
        cout<<"\nEnter polynomial 2:";
        cout<<"\nEnter number of terms:";
        cin>>terms;
        cout<<terms;
        poly p2[terms+1];
        p2[0].coef=terms;
        for(int i=1;i<=p2[0].coef;i++)
        {
                cout<<"\nEnter the coefficient:";
                cin>>p2[i].coef;
                cout<<"\nEnter the exponent:";
                cin>>p2[i].expo;
        }
        cout<<"\nThe second polynomial is: ";
        for(int i=1;i<=p2[0].coef;i++)
        {
                cout<<p2[i].coef<<"x^"<<p2[i].expo<<"+";
        }
        //add 2 poly
        int size=1;
        poly p3[p1[0].coef+p2[0].coef];
        int x=1;
        int y=1;//x points to p1 y points to p2
        while(x<=p1[0].coef && y<=p2[0].coef)
        {
                          cout<<x<<"x "<<y<<"y"<<endl;
                if(p1[x].expo>p2[y].expo)
                {
                        p3[size].coef=p1[x].coef;
                        p3[size++].expo=p1[x].expo;

                        x++;
                }
                else if (p1[x].expo<p2[y].expo)
                {
                        p3[size].coef=p2[y].coef;
                        p3[size++].expo=p2[y].expo;
                        y++;
                }
                else
                {
                        p3[size].coef=p1[x].coef+p2[y].coef;
                        p3[size++].expo=p1[x].expo;
                        x++;y++;

                }
        }
        while(x<=p1[0].coef)
        {
                p3[size].coef=p1[x].coef;
                p3[size++].expo=p1[x++].expo;
                
        }
        while(y<=p2[0].coef)
        {
                p3[size].coef=p2[y].coef;
                p3[size++].expo=p2[y++].expo;
               
        }
        p3[0].coef=size-1;
        cout<<"\nThe output polynomial is: ";
        for(int i=1;i<=p3[0].coef;i++)
        {
                cout<<p3[i].coef<<"x^"<<p3[i].expo<<"+";
        }
        cout<<endl;
        return 0;
}
