package q9;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import com.cnl.kikoeru.R;
import com.tencent.bugly.beta.tinker.TinkerReport;
import com.tencent.mmkv.MMKV;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.UUID;
import m0.l3;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j0 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18027a;

    public /* synthetic */ j0(int i10) {
        this.f18027a = i10;
    }

    @Override // ic.a
    public final Object b() throws IOException {
        String strG;
        int i10 = this.f18027a;
        int i11 = 10;
        int i12 = 6;
        z = false;
        boolean z10 = false;
        yb.c cVar = null;
        int i13 = 1;
        int i14 = 2;
        ub.a0 a0Var = ub.a0.f21526a;
        switch (i10) {
            case 0:
                return new i0(i12);
            case 1:
                return new i0(7);
            case 2:
                na.q.e("https://t.me/+hZALL6s4hexhZjY1");
                return a0Var;
            case 3:
                na.v.f15761a.getClass();
                na.v.f15764d.e(0L, na.v.f15762b[1]);
                hf.y yVar = (hf.y) a9.i.f240k.getValue();
                pf.e eVar = hf.l0.f8566a;
                hf.a0.y(yVar, pf.d.f17138c, null, new cg.t(true, null), 2);
                return a0Var;
            case 4:
                wb.b bVar = r9.f.f18979c;
                ArrayList arrayList = new ArrayList(vb.n.K(bVar, 10));
                ListIterator listIterator = bVar.listIterator(0);
                while (true) {
                    h1.z zVar = (h1.z) listIterator;
                    if (!zVar.hasNext()) {
                        return vb.w.A(arrayList);
                    }
                    r9.c cVar2 = (r9.c) zVar.next();
                    arrayList.add(new ub.k(cVar2.f18964a, cVar2));
                }
                break;
            case 5:
                throw new IllegalStateException("AppNavController Not Provide");
            case 6:
                return UUID.randomUUID();
            case 7:
                x0.z zVar2 = s0.g.f19324a;
                return "DEFAULT_TEST_TAG";
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                d9.g gVar = (d9.g) a9.i.c().f4312q.getValue();
                gVar.getClass();
                return new d9.f(new n7.w("SELECT * FROM AccountBean", new l3(i11)), gVar, gVar.f5563a, new String[]{"AccountBean"}, 0);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                return t2.e0.f20316d;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                t9.a[] aVarArrValues = t9.a.values();
                ArrayList arrayList2 = new ArrayList(aVarArrValues.length);
                for (t9.a aVar : aVarArrValues) {
                    int iOrdinal = aVar.ordinal();
                    if (iOrdinal == 0) {
                        strG = na.q.g(R.string.title);
                    } else if (iOrdinal == 1) {
                        strG = "RJ";
                    } else if (iOrdinal == 2) {
                        strG = na.q.g(R.string.circle);
                    } else if (iOrdinal == 3) {
                        strG = na.q.g(R.string.voice_actor);
                    } else if (iOrdinal == 4) {
                        strG = na.q.g(R.string.tag);
                    } else {
                        if (iOrdinal != 5) {
                            throw new ce.j0();
                        }
                        strG = na.q.g(R.string.main_others);
                    }
                    arrayList2.add(new ub.k(aVar, strG));
                }
                return vb.w.A(arrayList2);
            case 11:
                if (Build.VERSION.SDK_INT >= 29) {
                    File databasePath = a9.i.a().getDatabasePath("kikoeru");
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("_display_name", "kikoeru.db");
                    contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
                    Uri uriInsert = a9.i.a().getContentResolver().insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
                    jc.l.b(uriInsert);
                    OutputStream outputStreamOpenOutputStream = a9.i.a().getContentResolver().openOutputStream(uriInsert);
                    jc.l.b(outputStreamOpenOutputStream);
                    try {
                        jc.l.b(databasePath);
                        FileInputStream fileInputStream = new FileInputStream(databasePath);
                        try {
                            pc.f0.u(fileInputStream, outputStreamOpenOutputStream);
                            fileInputStream.close();
                            outputStreamOpenOutputStream.close();
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                ka.n.c("done file location: /sdcard/Download/kikoeru.db", -1L, null, null, 510);
                return a0Var;
            case 12:
                MMKV.h().close();
                if (v9.b.c().delete() && ((File) v9.b.f22800b.getValue()).delete()) {
                    z10 = true;
                }
                ka.n.c("done: success: " + z10, 0L, new t9.c(i13), null, 507);
                return a0Var;
            case 13:
                ka.n.c("done: success: " + a9.i.a().deleteDatabase("kikoeru"), 0L, null, null, 511);
                return a0Var;
            case 14:
                if (Build.VERSION.SDK_INT >= 29) {
                    MMKV.h().t();
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("_display_name", "mmkv.default");
                    contentValues2.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
                    Uri uriInsert2 = a9.i.a().getContentResolver().insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues2);
                    jc.l.b(uriInsert2);
                    OutputStream outputStreamOpenOutputStream2 = a9.i.a().getContentResolver().openOutputStream(uriInsert2);
                    jc.l.b(outputStreamOpenOutputStream2);
                    try {
                        FileInputStream fileInputStream2 = new FileInputStream(v9.b.c());
                        try {
                            pc.f0.u(fileInputStream2, outputStreamOpenOutputStream2);
                            fileInputStream2.close();
                            outputStreamOpenOutputStream2.close();
                        } finally {
                        }
                    } finally {
                    }
                }
                ka.n.c("done", 0L, null, null, 511);
                return a0Var;
            case 15:
                return new File(MMKV.f5176e, "mmkv.default");
            case 16:
                return new File(MMKV.f5176e, "mmkv.default.crc");
            case 17:
                x0.p.d("Unexpected call to default provider");
                throw new ce.j0();
            case 18:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 19:
                pf.e eVar2 = hf.l0.f8566a;
                hf.a0.y(hf.a0.b(pf.d.f17138c), null, null, new ba.t(i14, cVar, i12), 3);
                return a0Var;
            case 20:
                pf.e eVar3 = hf.l0.f8566a;
                hf.a0.y(hf.a0.b(pf.d.f17138c), null, null, new f9.d(2, null), 3);
                return a0Var;
            case 21:
                return xf.d0.f24992b;
            case 22:
                return xf.w.f25021b;
            case 23:
                return xf.t.f25019b;
            case 24:
                return xf.a0.f24986b;
            case 25:
                return xf.g.f24998b;
            case 26:
                return x0.v.v(Boolean.FALSE);
            case 27:
                return x0.v.v(Boolean.FALSE);
            default:
                pc.u[] uVarArr = z9.m.f26642a;
                return a0Var;
        }
    }
}
