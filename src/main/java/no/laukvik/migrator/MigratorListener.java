package no.laukvik.migrator;

public interface MigratorListener {
    void starting(String table, int max);
    void rowCopied(int rowIndex, String table);
    void finished(String table);
    void failed(String table, Exception e);
}
