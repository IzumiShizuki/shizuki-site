package d9;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.tencent.mmkv.MMKV;
import hf.y;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import pc.f0;
import q.t0;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f5594f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(List list, yb.c cVar, int i10) {
        super(2, cVar);
        this.f5593e = i10;
        this.f5594f = list;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f5593e) {
            case 0:
                return new q(this.f5594f, cVar, 0);
            case 1:
                return new q(this.f5594f, cVar, 1);
            default:
                return new q(this.f5594f, cVar, 2);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) throws IOException {
        y yVar = (y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f5593e) {
            case 0:
                q qVar = (q) o(yVar, cVar);
                a0 a0Var = a0.f21526a;
                qVar.u(a0Var);
                return a0Var;
            case 1:
                q qVar2 = (q) o(yVar, cVar);
                a0 a0Var2 = a0.f21526a;
                qVar2.u(a0Var2);
                return a0Var2;
            default:
                q qVar3 = (q) o(yVar, cVar);
                a0 a0Var3 = a0.f21526a;
                qVar3.u(a0Var3);
                return a0Var3;
        }
    }

    @Override // ac.a
    public final Object u(Object obj) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        int i10 = this.f5593e;
        a0 a0Var = a0.f21526a;
        List<c9.f> list = this.f5594f;
        switch (i10) {
            case 0:
                ub.a.f(obj);
                for (c9.f fVar : list) {
                    if (fVar.f3807e == null) {
                        fVar.f3807e = na.w.d(fVar.f3806d);
                    }
                    if (fVar.f3809g == null) {
                        fVar.f3809g = na.w.d(fVar.f3808f);
                    }
                }
                return a0Var;
            case 1:
                ub.a.f(obj);
                File databasePath = a9.i.a().getDatabasePath("kikoeru");
                a9.i.a().deleteDatabase("kikoeru");
                parcelFileDescriptorOpenFileDescriptor = a9.i.a().getContentResolver().openFileDescriptor((Uri) vb.m.Y(list), "r");
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                        try {
                            jc.l.b(databasePath);
                            fileOutputStream = new FileOutputStream(databasePath);
                            try {
                                long jU = f0.u(fileInputStream, fileOutputStream);
                                fileOutputStream.close();
                                fileInputStream.close();
                                new Long(jU);
                                parcelFileDescriptorOpenFileDescriptor.close();
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
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                ka.n.c(t0.D("导入成功 ", na.w.l(databasePath.length()), "，请重启app"), -1L, new t9.c(2), null, 506);
                return a0Var;
            default:
                ub.a.f(obj);
                MMKV.h().close();
                v9.b.c().delete();
                ((File) v9.b.f22800b.getValue()).delete();
                parcelFileDescriptorOpenFileDescriptor = a9.i.a().getContentResolver().openFileDescriptor((Uri) vb.m.Y(list), "r");
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                        try {
                            fileOutputStream = new FileOutputStream(v9.b.c());
                            try {
                                long jU2 = f0.u(fileInputStream, fileOutputStream);
                                fileOutputStream.close();
                                fileInputStream.close();
                                new Long(jU2);
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                }
                ka.n.c(t0.D("导入成功 ", na.w.l(v9.b.c().length()), "，请重启app"), -1L, new t9.c(3), null, 506);
                return a0Var;
        }
    }
}
