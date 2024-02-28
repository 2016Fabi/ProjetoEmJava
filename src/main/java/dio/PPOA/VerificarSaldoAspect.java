package dio.PPOA;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.JoinPoint;
@Aspect
public class VerificarSaldoAspect {
    @Before("execution(* ContaBancaria.sacar(..))")
    public void verificarSaldo(JoinPoint joinPoint) {
        ContaBancaria conta = (ContaBancaria) joinPoint.getTarget();
        double valorSaque = (double) joinPoint.getArgs()[0];

        if (valorSaque > conta.getSaldo()) {
            System.out.println("Operação de saque cancelada. Saldo insuficiente.");
        } else {
            System.out.println("Verificação de saldo aprovada para saque de " + valorSaque);
        }
    }
}
