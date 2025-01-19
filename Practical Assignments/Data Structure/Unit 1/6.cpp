#include<iostream>
using namespace std;
int main()
{
	int r,c,z=0,nz=0;
	cout<<"Enter array row :";
	cin>>r;
	cout<<"Enter array col :";
	cin>>c;
	
	int arr[r][c];
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			cout<<"Enter element :";
			cin>>arr[i][j];
		}
	}
	
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			if(arr[i][j]==0)
			{
				z++;
			}
			else
			{
				nz++;
			}
		}
	}
	
	int arr2[3][nz],k=0;
	if(z>nz)
	{
		for(int i=0;i<r;i++)
		{
			for (int j=0;j<c;j++)
			{
				if(arr[i][j]!=0)
				{
					arr2[0][k]=i;
					arr2[1][k]=j;
					arr2[2][k]=arr[i][j];	
					k++;		
				}
			}
		}
		for(int i=0;i<3;i++)
			{
				for (int j=0;j<nz;j++)
				{
					cout<<arr2[i][j];
				}
				cout<<"\n";
			}
	}
	else
	{
		cout<<"Not spars Matrix \n";
	}
	return 0;
}