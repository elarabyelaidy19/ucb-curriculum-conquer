
public class QuikFindDS implements DisJointSets { 

    private int[] id; 

    public QuikFindDS(int N) { 
        id = new int[N]; 
        for(int i = 0; i< N; i++) { 
            id[i] = i;
        }
    }


    public void connect(int p, int q ) { 
        int pid = id[p]; 
        int qid = id[q]; 

        for(int i = 0; i < id.length; i+= 1) { 
            if(id[i] == pid) { 
                id[i] = qid; 
            }
        }
    }

    public boolean isConnected(int p, int q) {  
        return (id[p] == id[q]);
    }


}
