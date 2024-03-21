import java.util.Scanner;

public class App {
    static Turma[] turmas = new Turma[10];
    static Aluno[] alunos = new Aluno[10];
    static Campus[] campi = new Campus[10];
    static Curso[] cursos = new Curso[10];
    static Matricula[] matriculas = new Matricula[10];
    static int quantidadeTurma = 0;
    static int quantidadeAluno = 0;
    static int quantidadeCampus = 0;
    static int quantidadeCurso = 0;
    static int quantidadeMatricula = 0;

    static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) throws Exception {
        int opcao = 0;

        do{
            exibirMenu(); 
            opcao = scanner.nextInt();
            scanner.nextLine();
            roteador(opcao);
        } while(opcao != 0 );
    }

    public static void roteador(int opcao) {
        switch (opcao) {
            case 1:
                cadastrarTurma();
                break;
            case 2:
                cadastrarCampus();
                
                break;
            case 3:
                cadastrarCurso();
                
                break;
            case 4:
                cadastrarAluno();
                
                break;
            case 5:
                cadastrarMatricula();
                
                break;
            case 6:
                gerarRelatorio();
                break;
            default:
                if(opcao !=0){
                    System.out.println("Opção inválida");
                }
                break;
        }
    }

    private static void gerarRelatorio() {
        for (int i = 0; i < quantidadeTurma; i++) {
            System.out.println("Nome da turma: "+ turmas[i].nome);
            System.out.println("Número mínimo de alunos: "+ turmas[i].numeroMinimo);
            System.out.println("Ano de ingresso: "+ turmas[i].anoIngresso);
        }
        for (int i = 0; i < quantidadeAluno; i++) {
            System.out.println("Nome do aluno: "+ alunos[i].nome);
            System.out.println("CPF do aluno: "+ alunos[i].cpf);
            System.out.println("Telefone do aluno: "+ alunos[i].telefone);
            System.out.println("Endereço do aluno: "+ alunos[i].endereco);
            System.out.println("Data de nascimento do aluno: "+ alunos[i].dataNascimento);
        }
        for (int i = 0; i < quantidadeCampus; i++) {
            System.out.println("Nome do campus: "+ campi[i].nome);
            System.out.println("Cidade do campus: "+ campi[i].cidade);
            System.out.println("Endereço de campus: "+ campi[i].endereco);
        }
        for (int i = 0; i < quantidadeCurso; i++) {
            System.out.println("Nome do curso: "+ cursos[i].nome);
            System.out.println("Duração do curso: "+ cursos[i].duracao);
            System.out.println("Modalidade do curso: "+ cursos[i].modalidade);
        }
        for (int i = 0; i < quantidadeMatricula; i++) {
            System.out.println("RA da matrícula: "+ matriculas[i].ra);
            System.out.println("Data da matrícula: "+ matriculas[i].data);
            System.out.println("Situação da matrícula: "+ matriculas[i].situacao);
        }
    }

    public static void cadastrarTurma() {
        Turma turma = new Turma();
        System.out.println("Digite o nome da turma: ");
        turma.nome = scanner.nextLine();
        System.out.println("Digite o numero mínimo de alunos: ");
        turma.numeroMinimo = scanner.nextInt();
        System.out.println("Digite o ano de ingresso: ");
        turma.anoIngresso = scanner.nextInt();
        turmas[quantidadeTurma] = turma;
        quantidadeTurma++;
    }

    private static void cadastrarMatricula() {
        Matricula matricula = new Matricula();
        System.out.println("Digite o ra da matrícula: ");
        matricula.ra = scanner.nextLine();
        System.out.println("Digite a data da matrícula: ");
        matricula.data = scanner.nextLine();
        System.out.println("Digite a situação da matrícula: ");
        matricula.situacao = scanner.nextLine();
        matriculas[quantidadeMatricula] = matricula;
        quantidadeMatricula++;
    }

    private static void cadastrarAluno() {
        Aluno aluno = new Aluno();
        System.out.println("Digite o nome do aluno: ");
        aluno.nome = scanner.nextLine();
        System.out.println("Digite o cpf do aluno: ");
        aluno.cpf = scanner.nextLine();
        System.out.println("Digite o telefone do aluno: ");
        aluno.telefone = scanner.nextLine();
        System.out.println("Digite o endereço do aluno: ");
        aluno.endereco = scanner.nextLine();
        System.out.println("Digite a data de nascimento do aluno: ");
        aluno.dataNascimento = scanner.nextLine();
        alunos[quantidadeAluno] = aluno;
        quantidadeAluno++;
    }

    private static void cadastrarCurso() {
        Curso curso = new Curso();
        System.out.println("Digite o nome do curso: ");
        curso.nome = scanner.nextLine();
        System.out.println("Digite a duração do curso: ");
        curso.duracao = scanner.nextLine();
        System.out.println("Digite a modalidade do curso: ");
        curso.modalidade = scanner.nextLine();
        cursos[quantidadeCurso] = curso;
        quantidadeCurso++;
    }

    private static void cadastrarCampus() {
        Campus campus = new Campus();
        System.out.println("Digite o nome do campus: ");
        campus.nome = scanner.nextLine();
        System.out.println("Digite a cidade do campus: ");
        campus.cidade = scanner.nextLine();
        System.out.println("Digite o endereço do campus: ");
        campus.endereco = scanner.nextLine();
        campi[quantidadeCampus] = campus;
        quantidadeCampus++;
    }


    public static void exibirMenu(){
        System.out.println("*************************************");
        System.out.println("Digite 1 para cadastro de turma.");
        System.out.println("Digite 2 para cadastro de campus.");
        System.out.println("Digite 3 para cadastro de curso.");
        System.out.println("Digite 4 para cadastro de estudante.");
        System.out.println("Digite 5 para cadastro de matricula.");
        System.out.println("Digite 6 para exibir tudo.");
        System.out.println("Digite 0 para sair.");
        System.out.println("**************************************");
    }
}
