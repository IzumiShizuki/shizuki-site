package b4;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import com.cnl.kikoeru.MainApplication;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1501a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Uri f1502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f1503c;

    public /* synthetic */ a() {
    }

    public static a a(MainApplication mainApplication, Uri uri) {
        String treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
        if (DocumentsContract.isDocumentUri(mainApplication, uri)) {
            treeDocumentId = DocumentsContract.getDocumentId(uri);
        }
        if (treeDocumentId == null) {
            throw new IllegalArgumentException("Could not get document ID from Uri: " + uri);
        }
        Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uri, treeDocumentId);
        if (uriBuildDocumentUriUsingTree != null) {
            return new a(mainApplication, uriBuildDocumentUriUsingTree);
        }
        throw new NullPointerException("Failed to build documentUri from a tree: " + uri);
    }

    public final String b() {
        switch (this.f1501a) {
            case 0:
                return a.a.K((MainApplication) this.f1503c, this.f1502b, "_display_name");
            default:
                return a.a.K(this.f1503c, this.f1502b, "_display_name");
        }
    }

    public final Uri c() {
        switch (this.f1501a) {
        }
        return this.f1502b;
    }

    public final boolean d() {
        switch (this.f1501a) {
            case 0:
                return "vnd.android.document/directory".equals(a.a.K((MainApplication) this.f1503c, this.f1502b, "mime_type"));
            default:
                return "vnd.android.document/directory".equals(a.a.K(this.f1503c, this.f1502b, "mime_type"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0079 A[LOOP:1: B:27:0x0076->B:29:0x0079, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final b4.a[] e() {
        /*
            r11 = this;
            int r0 = r11.f1501a
            switch(r0) {
                case 0: goto L93;
                default: goto L5;
            }
        L5:
            android.content.Context r1 = r11.f1503c
            android.content.ContentResolver r2 = r1.getContentResolver()
            android.net.Uri r0 = r11.f1502b
            java.lang.String r3 = android.provider.DocumentsContract.getDocumentId(r0)
            android.net.Uri r3 = android.provider.DocumentsContract.buildChildDocumentsUriUsingTree(r0, r3)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r9 = 0
            r10 = 0
            java.lang.String r4 = "document_id"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            r6 = 0
            r7 = 0
            r5 = 0
            android.database.Cursor r10 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
        L29:
            boolean r2 = r10.moveToNext()     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            if (r2 == 0) goto L3f
            java.lang.String r2 = r10.getString(r9)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            android.net.Uri r2 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r0, r2)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            r8.add(r2)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            goto L29
        L3b:
            r0 = move-exception
            goto L86
        L3d:
            r0 = move-exception
            goto L49
        L3f:
            android.database.Cursor r10 = (android.database.Cursor) r10
            android.database.Cursor r10 = (android.database.Cursor) r10     // Catch: java.lang.RuntimeException -> L47 java.lang.Exception -> L6b
            a0.c.M(r10)     // Catch: java.lang.RuntimeException -> L47 java.lang.Exception -> L6b
            goto L6b
        L47:
            r0 = move-exception
            throw r0
        L49:
            java.lang.String r2 = "DocumentFile"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3b
            r3.<init>()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r4 = "Failed query: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L3b
            r3.append(r0)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L3b
            android.util.Log.w(r2, r0)     // Catch: java.lang.Throwable -> L3b
            android.database.Cursor r10 = (android.database.Cursor) r10
            if (r10 == 0) goto L6b
            android.database.Cursor r10 = (android.database.Cursor) r10     // Catch: java.lang.RuntimeException -> L69 java.lang.Exception -> L6b
            a0.c.M(r10)     // Catch: java.lang.RuntimeException -> L69 java.lang.Exception -> L6b
            goto L6b
        L69:
            r0 = move-exception
            throw r0
        L6b:
            android.net.Uri[] r0 = new android.net.Uri[r9]
            java.lang.Object[] r0 = r8.toArray(r0)
            android.net.Uri[] r0 = (android.net.Uri[]) r0
            int r2 = r0.length
            b4.a[] r2 = new b4.a[r2]
        L76:
            int r3 = r0.length
            if (r9 >= r3) goto L85
            b4.a r3 = new b4.a
            r4 = r0[r9]
            r3.<init>(r1, r4)
            r2[r9] = r3
            int r9 = r9 + 1
            goto L76
        L85:
            return r2
        L86:
            android.database.Cursor r10 = (android.database.Cursor) r10
            if (r10 == 0) goto L92
            android.database.Cursor r10 = (android.database.Cursor) r10     // Catch: java.lang.RuntimeException -> L90 java.lang.Exception -> L92
            a0.c.M(r10)     // Catch: java.lang.RuntimeException -> L90 java.lang.Exception -> L92
            goto L92
        L90:
            r0 = move-exception
            throw r0
        L92:
            throw r0
        L93:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.a.e():b4.a[]");
    }

    public a(Context context, Uri uri) {
        this.f1503c = context;
        this.f1502b = uri;
    }
}
