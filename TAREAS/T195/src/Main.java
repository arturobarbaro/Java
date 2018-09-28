import java.io.IOException;
import java.net.URI;
import java.nio.file.*;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;

public class Main implements Path{

    public static void main(String[] args){
	// write your code here
        System.out.println(System.getProperty(User.));
        System.out.println(System.getProperty(System.lineSeparator()));
    }

    @Override
    public FileSystem getFileSystem() {
        return null;
    }

    @Override
    public boolean isAbsolute() {
        return false;
    }

    @Override
    public Path getRoot() {
        return null;
    }

    @Override
    public Path getFileName() {
        return null;
    }

    @Override
    public Path getParent() {
        return null;
    }

    @Override
    public int getNameCount() {
        return 0;
    }

    @Override
    public Path getName(int index) {
        return null;
    }

    @Override
    public Path subpath(int beginIndex, int endIndex) {
        return null;
    }

    @Override
    public boolean startsWith(Path other) {
        return false;
    }

    @Override
    public boolean startsWith(String other) {
        return false;
    }

    @Override
    public boolean endsWith(Path other) {
        return false;
    }

    @Override
    public Path normalize() {
        return null;
    }

    @Override
    public Path resolve(Path other) {
        return null;
    }

    @Override
    public Path relativize(Path other) {
        return null;
    }

    @Override
    public URI toUri() {
        return null;
    }

    @Override
    public Path toAbsolutePath() {
        return null;
    }

    @Override
    public Path toRealPath(LinkOption... options) throws IOException {
        return null;
    }

    @Override
    public WatchKey register(WatchService watcher, WatchEvent.Kind<?>[] events, WatchEvent.Modifier... modifiers) throws IOException {
        return null;
    }

    @Override
    public int compareTo(Path other) {
        return 0;
    }


    public FileSystemProvider provider() {
        return getFileSystem().provider();
    }

    public void close() throws IOException {
        getFileSystem().close();
    }

    public boolean isOpen() {
        return getFileSystem().isOpen();
    }

    public boolean isReadOnly() {
        return getFileSystem().isReadOnly();
    }

    public String getSeparator() {
        return getFileSystem().getSeparator();
    }

    public Iterable<Path> getRootDirectories() {
        return getFileSystem().getRootDirectories();
    }

    public Iterable<FileStore> getFileStores() {
        return getFileSystem().getFileStores();
    }

    public Set<String> supportedFileAttributeViews() {
        return getFileSystem().supportedFileAttributeViews();
    }

    public Path getPath(String first, String... more) {
        return getFileSystem().getPath(first, more);
    }

    public PathMatcher getPathMatcher(String syntaxAndPattern) {
        return getFileSystem().getPathMatcher(syntaxAndPattern);
    }

    public UserPrincipalLookupService getUserPrincipalLookupService() {
        return getFileSystem().getUserPrincipalLookupService();
    }

    public WatchService newWatchService() throws IOException {
        return getFileSystem().newWatchService();
    }
}
