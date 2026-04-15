package lh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class u extends l {
    @Override // lh.l
    public k B(y yVar) {
        jc.l.e(yVar, "path");
        File file = yVar.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new k(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
    }

    @Override // lh.l
    public final t D(y yVar) {
        return new t(new RandomAccessFile(yVar.toFile(), "r"));
    }

    @Override // lh.l
    public final f0 G(y yVar) {
        jc.l.e(yVar, "file");
        return new x(new FileOutputStream(yVar.toFile(), false), new j0());
    }

    @Override // lh.l
    public final h0 L(y yVar) {
        jc.l.e(yVar, "file");
        return new s(new FileInputStream(yVar.toFile()), j0.f12579d);
    }

    @Override // lh.l
    public final f0 b(y yVar) {
        jc.l.e(yVar, "file");
        return new x(new FileOutputStream(yVar.toFile(), true), new j0());
    }

    @Override // lh.l
    public void g(y yVar, y yVar2) throws IOException {
        jc.l.e(yVar, "source");
        jc.l.e(yVar2, "target");
        if (yVar.toFile().renameTo(yVar2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + yVar + " to " + yVar2);
    }

    @Override // lh.l
    public final void k(y yVar) throws IOException {
        jc.l.e(yVar, "dir");
        if (yVar.toFile().mkdir()) {
            return;
        }
        k kVarB = B(yVar);
        if (kVarB == null || !kVarB.f12584b) {
            throw new IOException("failed to create directory: " + yVar);
        }
    }

    @Override // lh.l
    public final void n(y yVar) throws IOException {
        jc.l.e(yVar, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = yVar.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("failed to delete " + yVar);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // lh.l
    public final List u(y yVar) throws IOException {
        jc.l.e(yVar, "dir");
        File file = yVar.toFile();
        String[] list = file.list();
        if (list == null) {
            if (file.exists()) {
                throw new IOException("failed to list " + yVar);
            }
            throw new FileNotFoundException("no such file: " + yVar);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            jc.l.b(str);
            arrayList.add(yVar.d(str));
        }
        vb.p.L(arrayList);
        return arrayList;
    }
}
