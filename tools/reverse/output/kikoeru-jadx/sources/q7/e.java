package q7;

import android.database.Cursor;
import i7.p2;
import java.util.Arrays;
import jc.l;
import ud.n;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f17900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long[] f17901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double[] f17902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String[] f17903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[][] f17904h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Cursor f17905i;

    public static void k(Cursor cursor, int i10) {
        if (i10 < 0 || i10 >= cursor.getColumnCount()) {
            n.D(25, "column index out of range");
            throw null;
        }
    }

    @Override // z7.c
    public final String M(int i10) {
        b();
        Cursor cursorN = n();
        k(cursorN, i10);
        String string = cursorN.getString(i10);
        l.d(string, "getString(...)");
        return string;
    }

    @Override // z7.c
    public final boolean Z() {
        b();
        i();
        Cursor cursor = this.f17905i;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // z7.c
    public final void c(int i10, long j10) {
        b();
        g(1, i10);
        this.f17900d[i10] = 1;
        this.f17901e[i10] = j10;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.f17909c) {
            b();
            this.f17900d = new int[0];
            this.f17901e = new long[0];
            this.f17902f = new double[0];
            this.f17903g = new String[0];
            this.f17904h = new byte[0][];
            reset();
        }
        this.f17909c = true;
    }

    @Override // z7.c
    public final void d(byte[] bArr, int i10) {
        l.e(bArr, "value");
        b();
        g(4, i10);
        this.f17900d[i10] = 4;
        this.f17904h[i10] = bArr;
    }

    @Override // z7.c
    public final void e(int i10) {
        b();
        g(5, i10);
        this.f17900d[i10] = 5;
    }

    public final void g(int i10, int i11) {
        int i12 = i11 + 1;
        int[] iArr = this.f17900d;
        if (iArr.length < i12) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i12);
            l.d(iArrCopyOf, "copyOf(...)");
            this.f17900d = iArrCopyOf;
        }
        if (i10 == 1) {
            long[] jArr = this.f17901e;
            if (jArr.length < i12) {
                long[] jArrCopyOf = Arrays.copyOf(jArr, i12);
                l.d(jArrCopyOf, "copyOf(...)");
                this.f17901e = jArrCopyOf;
                return;
            }
            return;
        }
        if (i10 == 2) {
            double[] dArr = this.f17902f;
            if (dArr.length < i12) {
                double[] dArrCopyOf = Arrays.copyOf(dArr, i12);
                l.d(dArrCopyOf, "copyOf(...)");
                this.f17902f = dArrCopyOf;
                return;
            }
            return;
        }
        if (i10 == 3) {
            String[] strArr = this.f17903g;
            if (strArr.length < i12) {
                Object[] objArrCopyOf = Arrays.copyOf(strArr, i12);
                l.d(objArrCopyOf, "copyOf(...)");
                this.f17903g = (String[]) objArrCopyOf;
                return;
            }
            return;
        }
        if (i10 != 4) {
            return;
        }
        byte[][] bArr = this.f17904h;
        if (bArr.length < i12) {
            Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i12);
            l.d(objArrCopyOf2, "copyOf(...)");
            this.f17904h = (byte[][]) objArrCopyOf2;
        }
    }

    @Override // z7.c
    public final byte[] getBlob(int i10) {
        b();
        Cursor cursorN = n();
        k(cursorN, i10);
        byte[] blob = cursorN.getBlob(i10);
        l.d(blob, "getBlob(...)");
        return blob;
    }

    @Override // z7.c
    public final int getColumnCount() {
        b();
        i();
        Cursor cursor = this.f17905i;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // z7.c
    public final String getColumnName(int i10) {
        b();
        i();
        Cursor cursor = this.f17905i;
        if (cursor == null) {
            throw new IllegalStateException("Required value was null.");
        }
        k(cursor, i10);
        String columnName = cursor.getColumnName(i10);
        l.d(columnName, "getColumnName(...)");
        return columnName;
    }

    @Override // z7.c
    public final long getLong(int i10) {
        b();
        Cursor cursorN = n();
        k(cursorN, i10);
        return cursorN.getLong(i10);
    }

    public final void i() {
        if (this.f17905i == null) {
            this.f17905i = this.f17907a.t(new p2(this));
        }
    }

    @Override // z7.c
    public final boolean isNull(int i10) {
        b();
        Cursor cursorN = n();
        k(cursorN, i10);
        return cursorN.isNull(i10);
    }

    public final Cursor n() {
        Cursor cursor = this.f17905i;
        if (cursor != null) {
            return cursor;
        }
        n.D(21, "no row");
        throw null;
    }

    @Override // z7.c
    public final void reset() {
        b();
        Cursor cursor = this.f17905i;
        if (cursor != null) {
            cursor.close();
        }
        this.f17905i = null;
    }

    @Override // z7.c
    public final void v(int i10, String str) {
        l.e(str, "value");
        b();
        g(3, i10);
        this.f17900d[i10] = 3;
        this.f17903g[i10] = str;
    }
}
