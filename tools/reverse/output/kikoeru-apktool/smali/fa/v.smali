.class public final Lfa/v;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Lfa/v;

.field public static final b:Lx0/e1;

.field public static final c:Lx0/e1;

.field public static final d:Li7/p2;

.field public static final e:Lx0/e1;

.field public static f:J

.field public static final g:Lx0/e1;

.field public static final h:Lx0/e1;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lfa/v;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lfa/v;->a:Lfa/v;

    .line 7
    .line 8
    const-wide/16 v0, 0x0

    .line 9
    .line 10
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    sput-object v1, Lfa/v;->b:Lx0/e1;

    .line 19
    .line 20
    invoke-static {v0}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, Lfa/v;->c:Lx0/e1;

    .line 25
    .line 26
    new-instance v0, Li7/p2;

    .line 27
    .line 28
    invoke-static {}, La9/i;->a()Lcom/cnl/kikoeru/MainApplication;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-static {v1}, Llc/b;->c(Landroid/content/Context;)Lf3/e;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    new-instance v7, Lm0/l3;

    .line 37
    .line 38
    const/4 v2, 0x1

    .line 39
    invoke-direct {v7, v2}, Lm0/l3;-><init>(I)V

    .line 40
    .line 41
    .line 42
    sget-object v6, Lm0/i4;->b:Lr/u1;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    new-instance v2, Lm0/x;

    .line 48
    .line 49
    new-instance v4, Le7/y;

    .line 50
    .line 51
    const/16 v3, 0xb

    .line 52
    .line 53
    invoke-direct {v4, v3, v1}, Le7/y;-><init>(ILjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    new-instance v5, Landroidx/lifecycle/n0;

    .line 57
    .line 58
    const/16 v3, 0x12

    .line 59
    .line 60
    invoke-direct {v5, v3, v1}, Landroidx/lifecycle/n0;-><init>(ILjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    sget-object v3, Lm0/r4;->a:Lm0/r4;

    .line 64
    .line 65
    invoke-direct/range {v2 .. v7}, Lm0/x;-><init>(Ljava/lang/Object;Lic/k;Lic/a;Lr/j;Lic/k;)V

    .line 66
    .line 67
    .line 68
    iput-object v2, v0, Li7/p2;->a:Ljava/lang/Object;

    .line 69
    .line 70
    sput-object v0, Lfa/v;->d:Li7/p2;

    .line 71
    .line 72
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 73
    .line 74
    invoke-static {v0}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    sput-object v1, Lfa/v;->e:Lx0/e1;

    .line 79
    .line 80
    const/4 v1, 0x0

    .line 81
    invoke-static {v1}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    sput-object v1, Lfa/v;->g:Lx0/e1;

    .line 86
    .line 87
    invoke-static {v0}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    sput-object v0, Lfa/v;->h:Lx0/e1;

    .line 92
    .line 93
    return-void
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
.end method

.method public static a(J)V
    .locals 5

    .line 1
    sget-object v0, Lfa/v;->g:Lx0/e1;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-static {p0, p1}, Lff/a;->d(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v3

    .line 11
    add-long/2addr v3, v1

    .line 12
    sput-wide v3, Lfa/v;->f:J

    .line 13
    .line 14
    :try_start_0
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ljava/util/Timer;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/util/Timer;->cancel()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v1

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    :goto_0
    const/4 v1, 0x0

    .line 29
    invoke-virtual {v0, v1}, Lx0/e1;->setValue(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    goto :goto_2

    .line 33
    :goto_1
    invoke-static {v1}, Lub/a;->b(Ljava/lang/Throwable;)Lub/m;

    .line 34
    .line 35
    .line 36
    :goto_2
    sget v1, Lff/a;->d:I

    .line 37
    .line 38
    const-wide/16 v1, 0x0

    .line 39
    .line 40
    cmp-long v3, p0, v1

    .line 41
    .line 42
    if-nez v3, :cond_1

    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_1
    :try_start_1
    new-instance v1, Ljava/util/Timer;

    .line 46
    .line 47
    invoke-direct {v1}, Ljava/util/Timer;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Ljava/util/Timer;

    .line 58
    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    new-instance v1, Lfa/u;

    .line 62
    .line 63
    invoke-direct {v1}, Lfa/u;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-static {p0, p1}, Lff/a;->d(J)J

    .line 67
    .line 68
    .line 69
    move-result-wide p0

    .line 70
    invoke-virtual {v0, v1, p0, p1}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 71
    .line 72
    .line 73
    goto :goto_3

    .line 74
    :catchall_1
    move-exception p0

    .line 75
    invoke-static {p0}, Lub/a;->b(Ljava/lang/Throwable;)Lub/m;

    .line 76
    .line 77
    .line 78
    :cond_2
    :goto_3
    return-void
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method
