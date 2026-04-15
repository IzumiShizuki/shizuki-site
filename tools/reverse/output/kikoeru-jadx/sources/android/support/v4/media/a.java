package android.support.v4.media;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.media3.exoplayer.offline.o;
import androidx.versionedparcelable.ParcelImpl;
import c7.b1;
import c7.c1;
import c7.d1;
import c7.m;
import c7.m1;
import c7.o1;
import c7.p1;
import c7.q0;
import c7.q1;
import c7.r0;
import com.tencent.bugly.beta.tinker.TinkerReport;
import com.tencent.bugly.crashreport.biz.UserInfoBean;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import g.e;
import java.util.LinkedHashMap;
import jc.l;
import m7.i0;
import m7.j0;
import m7.k;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f407a;

    public /* synthetic */ a(int i10) {
        this.f407a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Bundle bundle;
        c.b bVar = null;
        switch (this.f407a) {
            case 0:
                return new MediaBrowserCompat$MediaItem(parcel);
            case 1:
                int i10 = Build.VERSION.SDK_INT;
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String strG = b.g(mediaDescription);
                CharSequence charSequenceI = b.i(mediaDescription);
                CharSequence charSequenceH = b.h(mediaDescription);
                CharSequence charSequenceC = b.c(mediaDescription);
                Bitmap bitmapE = b.e(mediaDescription);
                Uri uriF = b.f(mediaDescription);
                Bundle bundleD = b.d(mediaDescription);
                if (bundleD != null) {
                    bundleD = android.support.v4.media.session.b.b0(bundleD);
                }
                Uri uriA = bundleD != null ? (Uri) bundleD.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
                if (uriA == null) {
                    bundle = bundleD;
                } else if (bundleD.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundleD.size() == 2) {
                    bundle = null;
                } else {
                    bundleD.remove("android.support.v4.media.description.MEDIA_URI");
                    bundleD.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = bundleD;
                }
                if (uriA == null) {
                    uriA = i10 >= 23 ? d.a(mediaDescription) : null;
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(strG, charSequenceI, charSequenceH, charSequenceC, bitmapE, uriF, bundle, uriA);
                mediaDescriptionCompat.f403i = mediaDescription;
                return mediaDescriptionCompat;
            case 2:
                return new MediaMetadataCompat(parcel);
            case 3:
                return new RatingCompat(parcel.readFloat(), parcel.readInt());
            case 4:
                return new o(parcel);
            case 5:
                c.d dVar = new c.d();
                IBinder strongBinder = parcel.readStrongBinder();
                int i11 = c.c.f3033f;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(c.b.f3032b);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c.b)) {
                        c.a aVar = new c.a();
                        aVar.f3031e = strongBinder;
                        bVar = aVar;
                    } else {
                        bVar = (c.b) iInterfaceQueryLocalInterface;
                    }
                }
                dVar.f3035a = bVar;
                return dVar;
            case 6:
                return new m(parcel);
            case 7:
                q0 q0VarA = q0.a(MediaDescription.CREATOR.createFromParcel(parcel));
                q0VarA.getClass();
                return q0VarA;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                return new r0(parcel);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                return new b1(parcel);
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                c1 c1Var = new c1();
                c1Var.f3598a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return c1Var;
            case 11:
                Parcelable parcelable = parcel.readParcelable(null);
                parcelable.getClass();
                return new d1(parcelable, null);
            case 12:
                m1 m1Var = new m1();
                m1Var.f3667a = parcel.readInt();
                m1Var.f3669c = parcel.readInt();
                m1Var.f3670d = parcel.readInt();
                m1Var.f3671e = parcel.readInt();
                m1Var.f3668b = parcel.readInt();
                return m1Var;
            case 13:
                return new p1(parcel);
            case 14:
                return new o1(parcel);
            case 15:
                return new q1(parcel.readFloat(), parcel.readInt());
            case 16:
                return new CrashDetailBean(parcel);
            case 17:
                l.e(parcel, "parcel");
                return new g.a(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            case 18:
                l.e(parcel, "inParcel");
                return new e(parcel);
            case 19:
                return new ParcelImpl(parcel);
            case 20:
                return new i5.c(parcel.readInt());
            case 21:
                k kVar = new k();
                kVar.f14903a = parcel.readInt();
                kVar.f14904b = parcel.readInt();
                kVar.f14905c = parcel.readInt() == 1;
                return kVar;
            case 22:
                i0 i0Var = new i0();
                i0Var.f14884a = parcel.readInt();
                i0Var.f14885b = parcel.readInt();
                i0Var.f14887d = parcel.readInt() == 1;
                int i12 = parcel.readInt();
                if (i12 > 0) {
                    int[] iArr = new int[i12];
                    i0Var.f14886c = iArr;
                    parcel.readIntArray(iArr);
                }
                return i0Var;
            case 23:
                j0 j0Var = new j0();
                j0Var.f14893a = parcel.readInt();
                j0Var.f14894b = parcel.readInt();
                int i13 = parcel.readInt();
                j0Var.f14895c = i13;
                if (i13 > 0) {
                    int[] iArr2 = new int[i13];
                    j0Var.f14896d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i14 = parcel.readInt();
                j0Var.f14897e = i14;
                if (i14 > 0) {
                    int[] iArr3 = new int[i14];
                    j0Var.f14898f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                j0Var.f14900h = parcel.readInt() == 1;
                j0Var.f14901i = parcel.readInt() == 1;
                j0Var.f14902j = parcel.readInt() == 1;
                j0Var.f14899g = parcel.readArrayList(i0.class.getClassLoader());
                return j0Var;
            case 24:
                return new UserInfoBean(parcel);
            case 25:
                return new PlugInBean(parcel);
            case 26:
                String string = parcel.readString();
                l.b(string);
                int i15 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i15);
                for (int i16 = 0; i16 < i15; i16++) {
                    String string2 = parcel.readString();
                    l.b(string2);
                    String string3 = parcel.readString();
                    l.b(string3);
                    linkedHashMap.put(string2, string3);
                }
                return new q8.b(linkedHashMap, string);
            default:
                return new StrategyBean(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f407a) {
            case 0:
                return new MediaBrowserCompat$MediaItem[i10];
            case 1:
                return new MediaDescriptionCompat[i10];
            case 2:
                return new MediaMetadataCompat[i10];
            case 3:
                return new RatingCompat[i10];
            case 4:
                return new o[i10];
            case 5:
                return new c.d[i10];
            case 6:
                return new m[i10];
            case 7:
                return new q0[i10];
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                return new r0[i10];
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                return new b1[i10];
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                return new c1[i10];
            case 11:
                return new d1[i10];
            case 12:
                return new m1[i10];
            case 13:
                return new p1[i10];
            case 14:
                return new o1[i10];
            case 15:
                return new q1[i10];
            case 16:
                return new CrashDetailBean[i10];
            case 17:
                return new g.a[i10];
            case 18:
                return new e[i10];
            case 19:
                return new ParcelImpl[i10];
            case 20:
                return new i5.c[i10];
            case 21:
                return new k[i10];
            case 22:
                return new i0[i10];
            case 23:
                return new j0[i10];
            case 24:
                return new UserInfoBean[i10];
            case 25:
                return new PlugInBean[i10];
            case 26:
                return new q8.b[i10];
            default:
                return new StrategyBean[i10];
        }
    }
}
