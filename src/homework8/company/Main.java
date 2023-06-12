package homework8.company;

class Main {

    public static void main(String[] args){

        Post[] posts = {new Director(), new Accountant(), new Worker()};
        for(Post post : posts){
            post.print();
        }
    }
}
