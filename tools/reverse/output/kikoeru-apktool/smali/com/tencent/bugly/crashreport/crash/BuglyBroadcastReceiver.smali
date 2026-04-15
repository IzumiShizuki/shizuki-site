.class public Lcom/tencent/bugly/crashreport/crash/BuglyBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field private static a:Lcom/tencent/bugly/crashreport/crash/BuglyBroadcastReceiver;


# instance fields
.field private b:Landroid/content/IntentFilter;

.field private c:Landroid/content/Context;

.field private d:Ljava/lang/String;

.field private e:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/tencent/bugly/crashreport/crash/BuglyBroadcastReceiver;->e:Z

    .line 6
    .line 7
    new-instance v0, Landroid/content/IntentFilter;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/tencent/bugly/crashreport/crash/BuglyBroadcastReceiver;->b:Landroid/content/IntentFilter;

    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public static synthetic a(Lcom/tencent/bugly/crashreport/crash/BuglyBroadcastReceiver;)Landroid/content/IntentFilter;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/tencent/bugly/crashreport/crash/BuglyBroadcastReceiver;->b:Landroid/content/IntentFilter;

    return-object p0
.end method

.method public static synthetic a()Lcom/tencent/bugly/crashreport/crash/BuglyBroadcastReceiver;
    .locals 1

    .line 1
    sget-object v0, Lcom/tencent/bugly/crashreport/crash/BuglyBroadcastReceiver;->a:Lcom/tencent/bugly/crashreport/crash/BuglyBroadcastReceiver;

    return-object v0
.end method

.method public static synthetic b(Lcom/tencent/bugly/crashreport/crash/BuglyBroadcastReceiver;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/crashreport/crash/BuglyBroadcastReceiver;->c:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public static declared-synchronized getInstance()Lcom/tencent/bugly/crashreport/crash/BuglyBroadcastReceiver;
    .locals 2

    .line 1
    const-class v0, Lcom/tencent/bugly/crashreport/crash/BuglyBroadcastReceiver;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/crashreport/crash/BuglyBroadcastReceiver;->a:Lcom/tencent/bugly/crashreport/crash/BuglyBroadcastReceiver;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lcom/tencent/bugly/crashreport/crash/BuglyBroadcastReceiver;

    .line 9
    .line 10
    invoke-direct {v1}, Lcom/tencent/bugly/crashreport/crash/BuglyBroadcastReceiver;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lcom/tencent/bugly/crashreport/crash/BuglyBroadcastReceiver;->a:Lcom/tencent/bugly/crashreport/crash/BuglyBroadcastReceiver;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    sget-object v1, Lcom/tencent/bugly/crashreport/crash/BuglyBroadcastReceiver;->a:Lcom/tencent/bugly/crashreport/crash/BuglyBroadcastReceiver;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-object v1

    .line 22
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw v1
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public final declared-synchronized a(Landroid/content/Context;Landroid/content/Intent;)Z
    .locals 7

    const-string v0, ""

    const-string v1, ""

    const-string v2, "is Connect BC "

    monitor-enter p0

    const/4 v3, 0x0

    if-eqz p1, :cond_7

    if-eqz p2, :cond_7

    .line 3
    :try_start_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p2

    const-string v4, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    goto/16 :goto_2

    .line 4
    :cond_0
    iget-boolean p2, p0, Lcom/tencent/bugly/crashreport/crash/BuglyBroadcastReceiver;->e:Z

    const/4 v4, 0x1

    if-eqz p2, :cond_1

    .line 5
    iput-boolean v3, p0, Lcom/tencent/bugly/crashreport/crash/BuglyBroadcastReceiver;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v4

    :catchall_0
    move-exception p1

    goto/16 :goto_1

    .line 6
    :cond_1
    :try_start_1
    iget-object p2, p0, Lcom/tencent/bugly/crashreport/crash/BuglyBroadcastReceiver;->c:Landroid/content/Context;

    invoke-static {p2}, Lcom/tencent/bugly/crashreport/common/info/b;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p2

    .line 7
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v5, v3, [Ljava/lang/Object;

    invoke-static {v2, v5}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 8
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/tencent/bugly/crashreport/crash/BuglyBroadcastReceiver;->d:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v1, v2, v3

    aput-object v0, v2, v4

    const-string v0, "network %s changed to %s"

    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    if-nez p2, :cond_2

    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Lcom/tencent/bugly/crashreport/crash/BuglyBroadcastReceiver;->d:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return v4

    .line 10
    :cond_2
    :try_start_2
    iget-object v0, p0, Lcom/tencent/bugly/crashreport/crash/BuglyBroadcastReceiver;->d:Ljava/lang/String;

    .line 11
    iput-object p2, p0, Lcom/tencent/bugly/crashreport/crash/BuglyBroadcastReceiver;->d:Ljava/lang/String;

    .line 12
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 13
    invoke-static {}, Lcom/tencent/bugly/crashreport/common/strategy/c;->b()Lcom/tencent/bugly/crashreport/common/strategy/c;

    move-result-object v5

    .line 14
    invoke-static {}, Lcom/tencent/bugly/proguard/T;->a()Lcom/tencent/bugly/proguard/T;

    move-result-object v6

    .line 15
    invoke-static {p1}, Lcom/tencent/bugly/crashreport/common/info/a;->a(Landroid/content/Context;)Lcom/tencent/bugly/crashreport/common/info/a;

    move-result-object p1

    if-eqz v5, :cond_6

    if-eqz v6, :cond_6

    if-nez p1, :cond_3

    goto :goto_0

    .line 16
    :cond_3
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    .line 17
    sget p1, Lcom/tencent/bugly/crashreport/crash/h;->a:I

    .line 18
    invoke-virtual {v6, p1}, Lcom/tencent/bugly/proguard/T;->b(I)J

    move-result-wide p1

    sub-long/2addr v1, p1

    const-wide/16 p1, 0x7530

    cmp-long v0, v1, p1

    if-lez v0, :cond_5

    .line 19
    new-array p1, v3, [Ljava/lang/Object;

    const-string p2, "try to upload crash on network changed."

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 20
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/h;->g()Lcom/tencent/bugly/crashreport/crash/h;

    move-result-object p1

    if-eqz p1, :cond_4

    const-wide/16 v0, 0x0

    .line 21
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/crashreport/crash/h;->a(J)V

    .line 22
    :cond_4
    new-array p1, v3, [Ljava/lang/Object;

    const-string p2, "try to upload userinfo on network changed."

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 23
    sget-object p1, Lcom/tencent/bugly/crashreport/biz/f;->i:Lcom/tencent/bugly/crashreport/biz/c;

    invoke-virtual {p1}, Lcom/tencent/bugly/crashreport/biz/c;->b()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_5
    monitor-exit p0

    return v4

    .line 24
    :cond_6
    :goto_0
    :try_start_3
    new-array p1, v3, [Ljava/lang/Object;

    const-string p2, "not inited BC not work"

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/X;->e(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return v4

    :goto_1
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1

    :cond_7
    :goto_2
    monitor-exit p0

    return v3
.end method

.method public declared-synchronized addFilter(Ljava/lang/String;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/tencent/bugly/crashreport/crash/BuglyBroadcastReceiver;->b:Landroid/content/IntentFilter;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Landroid/content/IntentFilter;->hasAction(Ljava/lang/String;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/tencent/bugly/crashreport/crash/BuglyBroadcastReceiver;->b:Landroid/content/IntentFilter;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    const/4 v0, 0x1

    .line 19
    new-array v0, v0, [Ljava/lang/Object;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    aput-object p1, v0, v1

    .line 23
    .line 24
    const-string p1, "add action %s"

    .line 25
    .line 26
    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    monitor-exit p0

    .line 30
    return-void

    .line 31
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    throw p1
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/crashreport/crash/BuglyBroadcastReceiver;->a(Landroid/content/Context;Landroid/content/Intent;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catchall_0
    move-exception p1

    .line 6
    invoke-static {p1}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/Throwable;)Z

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    if-nez p2, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method public declared-synchronized register(Landroid/content/Context;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-object p1, p0, Lcom/tencent/bugly/crashreport/crash/BuglyBroadcastReceiver;->c:Landroid/content/Context;

    .line 3
    .line 4
    new-instance p1, Lcb/t;

    .line 5
    .line 6
    const/4 v0, 0x3

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {p1, v0, p0, p0, v1}, Lcb/t;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lcom/tencent/bugly/proguard/ca;->a(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    monitor-exit p0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw p1
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public declared-synchronized unregister(Landroid/content/Context;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    :try_start_1
    const-string v1, "Unregister broadcast receiver of Bugly."
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    :try_start_2
    new-array v2, v2, [Ljava/lang/Object;

    .line 10
    .line 11
    invoke-static {v0, v1, v2}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lcom/tencent/bugly/crashreport/crash/BuglyBroadcastReceiver;->c:Landroid/content/Context;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    goto :goto_0

    .line 22
    :catchall_1
    move-exception p1

    .line 23
    goto :goto_2

    .line 24
    :goto_0
    :try_start_3
    invoke-static {p1}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/Throwable;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 31
    .line 32
    .line 33
    :cond_0
    :goto_1
    monitor-exit p0

    .line 34
    return-void

    .line 35
    :goto_2
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 36
    throw p1
.end method
