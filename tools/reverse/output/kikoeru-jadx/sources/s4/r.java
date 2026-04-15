package s4;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import ya.f1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f19469f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m0.w f19470g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m0.w f19471h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m f19472i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public HttpURLConnection f19473j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InputStream f19474k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f19475l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f19476m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f19477n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f19478o;

    public r(int i10, int i11, m0.w wVar) {
        super(true);
        this.f19468e = i10;
        this.f19469f = i11;
        this.f19470g = wVar;
        this.f19471h = new m0.w(17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h
    public final void close() {
        try {
            InputStream inputStream = this.f19474k;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    int i10 = p4.c0.f16548a;
                    throw new w(e10, 2000, 3);
                }
            }
        } finally {
            this.f19474k = null;
            g();
            if (this.f19475l) {
                this.f19475l = false;
                b();
            }
            this.f19473j = null;
            this.f19472i = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    @Override // s4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long f(s4.m r27) throws s4.w {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.r.f(s4.m):long");
    }

    public final void g() {
        HttpURLConnection httpURLConnection = this.f19473j;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                p4.c.o("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
        }
    }

    public final HttpURLConnection h(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map map) throws IOException {
        String string;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f19468e);
        httpURLConnection.setReadTimeout(this.f19469f);
        HashMap map2 = new HashMap();
        m0.w wVar = this.f19470g;
        if (wVar != null) {
            map2.putAll(wVar.E());
        }
        map2.putAll(this.f19471h.E());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = z.f19486a;
        if (j10 == 0 && j11 == -1) {
            string = null;
        } else {
            StringBuilder sb = new StringBuilder("bytes=");
            sb.append(j10);
            sb.append("-");
            if (j11 != -1) {
                sb.append((j10 + j11) - 1);
            }
            string = sb.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z11);
        httpURLConnection.setDoOutput(bArr != null);
        int i11 = m.f19442j;
        if (i10 == 1) {
            str = "GET";
        } else if (i10 == 2) {
            str = "POST";
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        httpURLConnection.setRequestMethod(str);
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    public final void l(long j10) throws IOException {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int iMin = (int) Math.min(j10, 4096);
            InputStream inputStream = this.f19474k;
            int i10 = p4.c0.f16548a;
            int i11 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new w(new InterruptedIOException(), 2000, 1);
            }
            if (i11 == -1) {
                throw new w();
            }
            j10 -= (long) i11;
            a(i11);
        }
    }

    @Override // s4.c, s4.h
    public final Map p() {
        HttpURLConnection httpURLConnection = this.f19473j;
        return httpURLConnection == null ? f1.f25977g : new q(httpURLConnection.getHeaderFields());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
    @Override // m4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(byte[] r7, int r8, int r9) throws s4.w {
        /*
            r6 = this;
            if (r9 != 0) goto L4
            r7 = 0
            return r7
        L4:
            long r0 = r6.f19477n     // Catch: java.io.IOException -> L32
            r2 = -1
            r4 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L1d
            long r2 = r6.f19478o     // Catch: java.io.IOException -> L32
            long r0 = r0 - r2
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L17
            goto L27
        L17:
            long r2 = (long) r9     // Catch: java.io.IOException -> L32
            long r0 = java.lang.Math.min(r2, r0)     // Catch: java.io.IOException -> L32
            int r9 = (int) r0     // Catch: java.io.IOException -> L32
        L1d:
            java.io.InputStream r0 = r6.f19474k     // Catch: java.io.IOException -> L32
            int r1 = p4.c0.f16548a     // Catch: java.io.IOException -> L32
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L32
            if (r7 != r4) goto L28
        L27:
            return r4
        L28:
            long r8 = r6.f19478o     // Catch: java.io.IOException -> L32
            long r0 = (long) r7     // Catch: java.io.IOException -> L32
            long r8 = r8 + r0
            r6.f19478o = r8     // Catch: java.io.IOException -> L32
            r6.a(r7)     // Catch: java.io.IOException -> L32
            return r7
        L32:
            r7 = move-exception
            int r8 = p4.c0.f16548a
            r8 = 2
            s4.w r7 = s4.w.a(r7, r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.r.read(byte[], int, int):int");
    }

    @Override // s4.h
    public final Uri w() {
        HttpURLConnection httpURLConnection = this.f19473j;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        m mVar = this.f19472i;
        if (mVar != null) {
            return mVar.f19443a;
        }
        return null;
    }
}
