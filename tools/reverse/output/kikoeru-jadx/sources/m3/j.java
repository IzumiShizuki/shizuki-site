package m3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Handler.Callback, ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f14067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f14068c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashSet f14069d = new HashSet();

    public j(Context context) {
        this.f14066a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f14067b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(i iVar) {
        boolean z10;
        ArrayDeque arrayDeque = iVar.f14064d;
        ComponentName componentName = iVar.f14061a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (iVar.f14062b) {
            z10 = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f14066a;
            boolean zBindService = context.bindService(component, this, 33);
            iVar.f14062b = zBindService;
            if (zBindService) {
                iVar.f14065e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z10 = iVar.f14062b;
        }
        if (!z10 || iVar.f14063c == null) {
            b(iVar);
            return;
        }
        while (true) {
            g gVar = (g) arrayDeque.peek();
            if (gVar == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Sending task " + gVar);
                }
                gVar.a(iVar.f14063c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Remote service has died: " + componentName);
                }
            } catch (RemoteException e10) {
                Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e10);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(iVar);
    }

    public final void b(i iVar) {
        ComponentName componentName = iVar.f14061a;
        ArrayDeque arrayDeque = iVar.f14064d;
        Handler handler = this.f14067b;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i10 = iVar.f14065e;
        int i11 = i10 + 1;
        iVar.f14065e = i11;
        if (i11 <= 6) {
            int i12 = (1 << i10) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i12 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i12);
            return;
        }
        Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + iVar.f14065e + " retries");
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i10 = message.what;
        b.c cVar = null;
        if (i10 == 0) {
            g gVar = (g) message.obj;
            String string = Settings.Secure.getString(this.f14066a.getContentResolver(), "enabled_notification_listeners");
            synchronized (k.f14070c) {
                if (string != null) {
                    try {
                        if (!string.equals(k.f14071d)) {
                            String[] strArrSplit = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(strArrSplit.length);
                            for (String str : strArrSplit) {
                                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                                if (componentNameUnflattenFromString != null) {
                                    hashSet2.add(componentNameUnflattenFromString.getPackageName());
                                }
                            }
                            k.f14072e = hashSet2;
                            k.f14071d = string;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                hashSet = k.f14072e;
            }
            if (!hashSet.equals(this.f14069d)) {
                this.f14069d = hashSet;
                List<ResolveInfo> listQueryIntentServices = this.f14066a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : listQueryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet3) {
                    if (!this.f14068c.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f14068c.put(componentName2, new i(componentName2));
                    }
                }
                Iterator it = this.f14068c.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        i iVar = (i) entry.getValue();
                        if (iVar.f14062b) {
                            this.f14066a.unbindService(this);
                            iVar.f14062b = false;
                        }
                        iVar.f14063c = null;
                        it.remove();
                    }
                }
            }
            for (i iVar2 : this.f14068c.values()) {
                iVar2.f14064d.add(gVar);
                a(iVar2);
            }
        } else if (i10 == 1) {
            h hVar = (h) message.obj;
            ComponentName componentName3 = hVar.f14059a;
            IBinder iBinder = hVar.f14060b;
            i iVar3 = (i) this.f14068c.get(componentName3);
            if (iVar3 != null) {
                int i11 = b.b.f1167e;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.c.f1168a);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b.c)) {
                        b.a aVar = new b.a();
                        aVar.f1166e = iBinder;
                        cVar = aVar;
                    } else {
                        cVar = (b.c) iInterfaceQueryLocalInterface;
                    }
                }
                iVar3.f14063c = cVar;
                iVar3.f14065e = 0;
                a(iVar3);
                return true;
            }
        } else if (i10 == 2) {
            i iVar4 = (i) this.f14068c.get((ComponentName) message.obj);
            if (iVar4 != null) {
                if (iVar4.f14062b) {
                    this.f14066a.unbindService(this);
                    iVar4.f14062b = false;
                }
                iVar4.f14063c = null;
                return true;
            }
        } else {
            if (i10 != 3) {
                return false;
            }
            i iVar5 = (i) this.f14068c.get((ComponentName) message.obj);
            if (iVar5 != null) {
                a(iVar5);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f14067b.obtainMessage(1, new h(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f14067b.obtainMessage(2, componentName).sendToTarget();
    }
}
