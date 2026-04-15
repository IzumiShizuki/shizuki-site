package n9;

import ac.i;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import hf.y;
import i9.g;
import ic.n;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jc.l;
import jc.r;
import jc.z;
import pc.f0;
import pc.u;
import ub.a0;
import ub.k;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i implements n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ u[] f15663f = {z.f10839a.f(new r(e.class, "documentUri", "<v#1>", 0))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f15664e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(long j10, yb.c cVar) {
        super(2, cVar);
        this.f15664e = j10;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        return new c(this.f15664e, cVar);
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        return ((c) o((y) obj, (yb.c) obj2)).u(a0.f21526a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v2, types: [java.lang.Throwable] */
    @Override // ac.a
    public final Object u(Object obj) throws FileNotFoundException {
        b4.a aVar;
        b4.a aVar2;
        Uri uriCreateDocument;
        Uri uriCreateDocument2;
        ub.a.f(obj);
        androidx.media3.exoplayer.offline.b bVar = h9.a.a().f932b;
        int[] iArrCopyOf = Arrays.copyOf(new int[]{3}, 1);
        bVar.b();
        b4.a aVar3 = null;
        Cursor cursorC = bVar.c(androidx.media3.exoplayer.offline.b.g(iArrCopyOf), null);
        androidx.media3.exoplayer.offline.a aVar4 = new androidx.media3.exoplayer.offline.a(cursorC, 0);
        long j10 = this.f15664e;
        try {
            ArrayList<k> arrayList = new ArrayList();
            int count = cursorC.getCount();
            for (int i10 = 0; i10 < count; i10++) {
                ((Cursor) aVar4.f869b).moveToPosition(i10);
                String str = androidx.media3.exoplayer.offline.b.e(cursorC).f892a.f945a;
                l.d(str, "id");
                Uri uri = androidx.media3.exoplayer.offline.b.e(cursorC).f892a.f946b;
                l.d(uri, "uri");
                StringBuilder sb = new StringBuilder();
                sb.append("RJ");
                sb.append(j10);
                k kVar = ef.u.k0(str, sb.toString(), false) ? new k(str, uri) : null;
                if (kVar != null) {
                    arrayList.add(kVar);
                }
            }
            aVar4.close();
            b4.a aVarA = b4.a.a(a9.i.a(), Uri.parse((String) f0.P(gg.c.a(), "documentUri", "", z.a(String.class)).c(f15663f[0])));
            for (k kVar2 : arrayList) {
                String str2 = (String) kVar2.f21543a;
                Uri uri2 = (Uri) kVar2.f21544b;
                List listK0 = ef.n.K0(str2, new String[]{"/"});
                b4.a aVar5 = aVarA;
                int i11 = 0;
                for (Object obj2 : listK0) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        ?? r17 = aVar3;
                        ud.b.H();
                        throw r17;
                    }
                    String str3 = (String) obj2;
                    if (i11 == ud.b.r(listK0)) {
                        switch (aVar5.f1501a) {
                            case 0:
                                throw new UnsupportedOperationException();
                            default:
                                Context context = aVar5.f1503c;
                                try {
                                    uriCreateDocument2 = DocumentsContract.createDocument(context.getContentResolver(), aVar5.f1502b, "application/octet-stream", str3);
                                } catch (Exception unused) {
                                    uriCreateDocument2 = null;
                                }
                                b4.a aVar6 = uriCreateDocument2 != null ? new b4.a(context, uriCreateDocument2) : null;
                                l.b(aVar6);
                                aVar = aVar3;
                                aVar5 = aVar6;
                                break;
                        }
                    } else {
                        b4.a[] aVarArrE = aVar5.e();
                        int length = aVarArrE.length;
                        int i13 = 0;
                        while (true) {
                            if (i13 < length) {
                                aVar2 = aVarArrE[i13];
                                aVar = aVar3;
                                if (!str3.equals(aVar2.b())) {
                                    i13++;
                                    aVar3 = aVar;
                                }
                            } else {
                                aVar = aVar3;
                                aVar2 = aVar;
                            }
                        }
                        if (aVar2 == null) {
                            switch (aVar5.f1501a) {
                                case 0:
                                    throw new UnsupportedOperationException();
                                default:
                                    Context context2 = aVar5.f1503c;
                                    try {
                                        uriCreateDocument = DocumentsContract.createDocument(context2.getContentResolver(), aVar5.f1502b, "vnd.android.document/directory", str3);
                                    } catch (Exception unused2) {
                                        uriCreateDocument = null;
                                    }
                                    b4.a aVar7 = uriCreateDocument != null ? new b4.a(context2, uriCreateDocument) : null;
                                    l.b(aVar7);
                                    aVar5 = aVar7;
                                    break;
                            }
                        } else {
                            aVar5 = aVar2;
                        }
                    }
                    aVar3 = aVar;
                    i11 = i12;
                }
                b4.a aVar8 = aVar3;
                OutputStream outputStreamOpenOutputStream = a9.i.a().getContentResolver().openOutputStream(aVar5.c());
                if (outputStreamOpenOutputStream != null) {
                    try {
                        g.a(uri2, outputStreamOpenOutputStream);
                    } catch (Throwable th2) {
                        ub.a.b(th2);
                    }
                }
                aVar3 = aVar8;
            }
            return new Integer(arrayList.size());
        } finally {
        }
    }
}
