package core.basesyntax.service;

import core.basesyntax.model.FruitTransaction;
import java.util.List;

public interface TransactionService {
    List<FruitTransaction> creatListTransaction(List<String> dataFromFile);
}