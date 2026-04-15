package s3;

import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.os.Trace;
import androidx.media3.exoplayer.offline.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import o.u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f19365a = new u(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f19366b = new i(18);

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:3:0x0005, B:4:0x000c, B:6:0x0012, B:8:0x001e, B:10:0x0025, B:13:0x002c, B:15:0x0038, B:19:0x0041, B:21:0x0047, B:28:0x0077, B:22:0x0057, B:24:0x0065, B:27:0x006e, B:29:0x007a), top: B:35:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static s3.e a(android.content.Context r8, java.util.List r9) {
        /*
            java.lang.String r0 = "FontProvider.getFontFamilyResult"
            a.a.t(r0)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L83
            r0.<init>()     // Catch: java.lang.Throwable -> L83
            r1 = 0
            r2 = 0
        Lc:
            int r3 = r9.size()     // Catch: java.lang.Throwable -> L83
            if (r2 >= r3) goto L7a
            java.lang.Object r3 = r9.get(r2)     // Catch: java.lang.Throwable -> L83
            s3.d r3 = (s3.d) r3     // Catch: java.lang.Throwable -> L83
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L83
            r5 = 31
            if (r4 < r5) goto L57
            java.lang.String r4 = r3.f19371e     // Catch: java.lang.Throwable -> L83
            n7.e r5 = p3.e.f16532a     // Catch: java.lang.Throwable -> L83
            r5 = 0
            if (r4 == 0) goto L3f
            boolean r6 = r4.isEmpty()     // Catch: java.lang.Throwable -> L83
            if (r6 == 0) goto L2c
            goto L3f
        L2c:
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r4, r1)     // Catch: java.lang.Throwable -> L83
            android.graphics.Typeface r7 = android.graphics.Typeface.DEFAULT     // Catch: java.lang.Throwable -> L83
            android.graphics.Typeface r7 = android.graphics.Typeface.create(r7, r1)     // Catch: java.lang.Throwable -> L83
            if (r6 == 0) goto L3f
            boolean r7 = r6.equals(r7)     // Catch: java.lang.Throwable -> L83
            if (r7 != 0) goto L3f
            r5 = r6
        L3f:
            if (r5 == 0) goto L57
            android.graphics.fonts.Font r5 = p3.e.a(r5)     // Catch: java.lang.Throwable -> L83
            if (r5 == 0) goto L57
            s3.f r5 = new s3.f     // Catch: java.lang.Throwable -> L83
            java.lang.String r3 = r3.f19372f     // Catch: java.lang.Throwable -> L83
            r5.<init>(r4, r3)     // Catch: java.lang.Throwable -> L83
            r3 = 1
            s3.f[] r3 = new s3.f[r3]     // Catch: java.lang.Throwable -> L83
            r3[r1] = r5     // Catch: java.lang.Throwable -> L83
            r0.add(r3)     // Catch: java.lang.Throwable -> L83
            goto L77
        L57:
            android.content.pm.PackageManager r4 = r8.getPackageManager()     // Catch: java.lang.Throwable -> L83
            android.content.res.Resources r5 = r8.getResources()     // Catch: java.lang.Throwable -> L83
            android.content.pm.ProviderInfo r4 = b(r4, r3, r5)     // Catch: java.lang.Throwable -> L83
            if (r4 != 0) goto L6e
            s3.e r8 = new s3.e     // Catch: java.lang.Throwable -> L83
            r8.<init>()     // Catch: java.lang.Throwable -> L83
            android.os.Trace.endSection()
            return r8
        L6e:
            java.lang.String r4 = r4.authority     // Catch: java.lang.Throwable -> L83
            s3.f[] r3 = c(r8, r3, r4)     // Catch: java.lang.Throwable -> L83
            r0.add(r3)     // Catch: java.lang.Throwable -> L83
        L77:
            int r2 = r2 + 1
            goto Lc
        L7a:
            s3.e r8 = new s3.e     // Catch: java.lang.Throwable -> L83
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L83
            android.os.Trace.endSection()
            return r8
        L83:
            r8 = move-exception
            android.os.Trace.endSection()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.c.a(android.content.Context, java.util.List):s3.e");
    }

    public static ProviderInfo b(PackageManager packageManager, d dVar, Resources resources) {
        i iVar = f19366b;
        u uVar = f19365a;
        a.a.t("FontProvider.getProvider");
        try {
            List listH = dVar.f19370d;
            String str = dVar.f19367a;
            String str2 = dVar.f19368b;
            if (listH == null) {
                listH = o3.b.h(resources, 0);
            }
            b bVar = new b();
            bVar.f19362a = str;
            bVar.f19363b = str2;
            bVar.f19364c = listH;
            ProviderInfo providerInfo = (ProviderInfo) uVar.b(bVar);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, iVar);
            for (int i10 = 0; i10 < listH.size(); i10++) {
                ArrayList arrayList2 = new ArrayList((Collection) listH.get(i10));
                Collections.sort(arrayList2, iVar);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i11), (byte[]) arrayList2.get(i11))) {
                            break;
                        }
                    }
                    uVar.c(bVar, providerInfoResolveContentProvider);
                    return providerInfoResolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012b A[Catch: all -> 0x014c, TRY_ENTER, TryCatch #3 {all -> 0x014c, blocks: (B:3:0x000b, B:5:0x003e, B:64:0x012b, B:65:0x012e, B:72:0x0145, B:73:0x0148, B:74:0x014b, B:6:0x0045, B:8:0x004c, B:32:0x00a1, B:34:0x00a6, B:36:0x00ac, B:37:0x00d5, B:41:0x00de, B:46:0x00eb, B:49:0x00f4, B:53:0x010a, B:56:0x0113, B:60:0x011f, B:51:0x00ff, B:69:0x013f, B:70:0x0142, B:10:0x0065, B:11:0x006d, B:12:0x0070, B:17:0x007a, B:20:0x0080, B:22:0x0089, B:27:0x0093, B:30:0x0099), top: B:83:0x000b, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static s3.f[] c(android.content.Context r18, s3.d r19, java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.c.c(android.content.Context, s3.d, java.lang.String):s3.f[]");
    }
}
