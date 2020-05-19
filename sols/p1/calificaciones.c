#include <stdio.h>
#include <stdlib.h>

void main()
{
    FILE *apArch;
    int m=5;
    int n=3;
    int i,j,ind;
    float *arr;
    
    if( (apArch=fopen("tabla.txt", "r")) == NULL ){
		printf("\n # IMPOSIBLE abrir el archivo: %s \n\n", "tabla.txt");
		exit(0);
	}
    
    arr = (float *)malloc(m*n*sizeof(float));
    
    for(i=0;i<m;i++){
        for(j=0;j<n;j++){
            ind = i*n+j;
            fscanf(apArch,"%f ",&arr[ind]);
        }
    }
    
    for(i=0;i<m;i++){
        for(j=0;j<n;j++){
            ind = i*n+j;
            printf("%f ",arr[ind]);
        }
        printf("\n");
    }
    

}



