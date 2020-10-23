import java.util.Scanner;

public class Caixa_poo {

	private double feijao = 10.00;

	double numero;
	double x = 1;

	Scanner s = new Scanner(System.in);

	public double getFeijao() {
		return feijao;
	}

	public void setFeijao(double feijao) {
		this.feijao = feijao;
	}

	public double getNumero() {
		return numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}

	public void metodo() {

		System.out.println("Valor do Feijao 10,00");

		while (x >= 0) {

			System.out.println("Digite o valor do Pagamento:");

			numero = s.nextDouble();

			if (numero >= feijao) {

				double troco = (numero - feijao);

				if (numero > feijao) {
					System.out.println("Valor do troco:" + troco);

				}

				else {

					if (troco == 0) {
						System.out.println("Nao havera troco");

						x++;

					}

				}

			}

			else {

				System.out.println("valor abaixo do permitido tente novamente");

			}

			if (numero == 0) {

				break;

			}

		}

	}

}
