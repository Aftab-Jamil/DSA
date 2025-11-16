import com.sun.security.jgss.GSSUtil;

public class Trie {

    private TrieNode root;
    public class TrieNode{
        private TrieNode [] childrens;
        private boolean isWord;
        public TrieNode(){
            childrens=new TrieNode[26];
            isWord=false;
        }
    }
    public Trie(){
        root=new TrieNode();
    }
    public void insert(String word){
        if(word==null || word.isEmpty()){
            throw new IllegalArgumentException("Sorry Your is empty, Can not inserted");
        }
        char x;
        word=word.toLowerCase();
        TrieNode current=root;
        for(int i=0;i<word.length();i++){
            x=word.charAt(i);
            int index=x-'a';
            if(current.childrens[index]==null){
                TrieNode newNode=new TrieNode();
                current.childrens[index]=newNode;
                current=newNode;
            }else{
                current=current.childrens[index];
            }

        }
        current.isWord=true;
    }
    public boolean search(String word){
        if(word==null || word.isEmpty()){
            throw new IllegalArgumentException("Sorry can not search");
        }
        word=word.toLowerCase();
        char x;
        TrieNode current=root;
        for(int i=0;i<word.length();i++){
            x=word.charAt(i);
            int index=x-'a';
            if(current.childrens[index]==null){
                return false;
            }
            current=current.childrens[index];
        }
        if(current.isWord){
            return true;
        }
        return false;
    }
    public boolean startsWith(String prefix){
        if(prefix==null || prefix.isEmpty()){
            throw new IllegalArgumentException("Sorry can not search");
        }
        TrieNode current=root;
        char x;
        prefix=prefix.toLowerCase();
        for(int i=0;i<prefix.length();i++){
            x=prefix.charAt(i);
            int index=x-'a';
            if(current.childrens[index]==null){
                return false;
            }
            current=current.childrens[index];
        }
        return true;
    }

    public static void main(String[] args) {
        Trie trie=new Trie();
        trie.insert("apple");
        trie.insert("sOOn");
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("soon"));
        trie.insert("SO");
        System.out.println(trie.search("so"));
        System.out.println(trie.search("soo"));
        System.out.println(trie.startsWith("sO"));
        System.out.println(trie.startsWith("Soo"));
        System.out.println(trie.startsWith("app"));
        System.out.println(trie.startsWith("le"));
        System.out.println(trie.startsWith("appla"));

    }
}
