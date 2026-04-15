package kg;

import c7.e1;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import nh.b;
import qg.g;
import qg.h;
import qg.k;
import rg.e;
import rg.j;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public File f11386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f11387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f11389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11390e;

    public final k b(e eVar) {
        h hVarO;
        if (eVar == null) {
            throw new og.a("FileHeader is null, cannot get InputStream");
        }
        i();
        j jVar = this.f11387b;
        if (jVar == null) {
            throw new og.a("zip model is null, cannot get inputstream");
        }
        try {
            hVarO = b.o(jVar);
            try {
                hVarO.b(eVar);
                k kVar = new k(hVarO);
                if (kVar.g(eVar) == null) {
                    throw new og.a("Could not locate local file header for corresponding file header");
                }
                this.f11389d.add(kVar);
                return kVar;
            } catch (IOException e10) {
                e = e10;
                if (hVarO != null) {
                    hVarO.close();
                }
                throw e;
            }
        } catch (IOException e11) {
            e = e11;
            hVarO = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.f11389d;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InputStream) it.next()).close();
        }
        arrayList.clear();
    }

    public final RandomAccessFile g() throws IOException {
        File file = this.f11386a;
        if (!file.getName().endsWith(".zip.001")) {
            return new RandomAccessFile(file, "r");
        }
        g gVar = new g(file, nh.a.k(file));
        gVar.b(gVar.f18281b.length - 1);
        return gVar;
    }

    public final void i() throws og.a {
        File file = this.f11386a;
        if (this.f11387b != null) {
            return;
        }
        if (!file.exists()) {
            j jVar = new j();
            this.f11387b = jVar;
            jVar.f19068f = file;
        } else {
            if (!file.canRead()) {
                throw new og.a("no read access for the input zip file");
            }
            try {
                RandomAccessFile randomAccessFileG = g();
                try {
                    j jVarQ = new e1(26).Q(randomAccessFileG, new rg.g(this.f11388c, this.f11390e));
                    this.f11387b = jVarQ;
                    jVarQ.f19068f = file;
                    randomAccessFileG.close();
                } finally {
                }
            } catch (og.a e10) {
                throw e10;
            } catch (IOException e11) {
                throw new og.a(e11);
            }
        }
    }

    public final String toString() {
        return this.f11386a.toString();
    }
}
