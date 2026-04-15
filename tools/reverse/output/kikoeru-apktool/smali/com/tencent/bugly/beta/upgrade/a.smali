.class public Lcom/tencent/bugly/beta/upgrade/a;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lcom/tencent/bugly/proguard/P;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:[Ljava/lang/Object;

.field public d:Z


# direct methods
.method public varargs constructor <init>(II[Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/tencent/bugly/beta/upgrade/a;->d:Z

    .line 6
    .line 7
    iput p1, p0, Lcom/tencent/bugly/beta/upgrade/a;->a:I

    .line 8
    .line 9
    iput p2, p0, Lcom/tencent/bugly/beta/upgrade/a;->b:I

    .line 10
    .line 11
    iput-object p3, p0, Lcom/tencent/bugly/beta/upgrade/a;->c:[Ljava/lang/Object;

    .line 12
    .line 13
    return-void
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
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method


# virtual methods
.method public a(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public declared-synchronized a(ILcom/tencent/bugly/proguard/qa;JJZLjava/lang/String;)V
    .locals 11

    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-boolean v2, p0, Lcom/tencent/bugly/beta/upgrade/a;->d:Z

    if-nez v2, :cond_13

    iget v2, p0, Lcom/tencent/bugly/beta/upgrade/a;->b:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p1, v2, :cond_13

    :try_start_1
    const-string v2, "upload %s:[%d] [sended %d] [recevied %d]"

    if-eqz p7, :cond_0

    .line 5
    const-string v3, "succ"

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_a

    :cond_0
    const-string v3, "err"
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 6
    :goto_0
    :try_start_2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static/range {p5 .. p6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    const/4 v6, 0x4

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v3, v6, v7

    aput-object p1, v6, v0

    const/4 p1, 0x2

    aput-object v4, v6, p1

    const/4 v3, 0x3

    aput-object v5, v6, v3

    .line 7
    invoke-static {v2, v6}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 8
    iget v2, p0, Lcom/tencent/bugly/beta/upgrade/a;->a:I

    if-eq v2, v0, :cond_6

    if-eq v2, p1, :cond_1

    goto/16 :goto_7

    .line 9
    :cond_1
    iget-object p1, p0, Lcom/tencent/bugly/beta/upgrade/a;->c:[Ljava/lang/Object;

    aget-object p1, p1, v7

    check-cast p1, Lcom/tencent/bugly/proguard/A;

    .line 10
    iget v1, p0, Lcom/tencent/bugly/beta/upgrade/a;->b:I

    const/16 v2, 0x323

    if-ne v1, v2, :cond_5

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/A;->a()Ljava/util/ArrayList;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    if-eqz p7, :cond_12

    if-eqz p2, :cond_3

    .line 11
    iget-object p2, p2, Lcom/tencent/bugly/proguard/qa;->e:[B

    const-class v1, Lcom/tencent/bugly/proguard/D;

    invoke-static {p2, v1}, Lcom/tencent/bugly/proguard/M;->a([BLjava/lang/Class;)Lcom/tencent/bugly/proguard/m;

    move-result-object p2

    check-cast p2, Lcom/tencent/bugly/proguard/D;

    if-eqz p2, :cond_3

    .line 12
    sget-object v1, Lcom/tencent/bugly/beta/upgrade/d;->a:Lcom/tencent/bugly/beta/upgrade/d;

    iget-object p2, p2, Lcom/tencent/bugly/proguard/D;->d:Lcom/tencent/bugly/proguard/sa;

    invoke-virtual {v1, p2}, Lcom/tencent/bugly/beta/upgrade/d;->a(Lcom/tencent/bugly/proguard/sa;)V

    goto :goto_1

    :catch_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_8

    .line 13
    :cond_3
    :goto_1
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/A;->a()Ljava/util/ArrayList;

    move-result-object p1

    .line 14
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-le p2, v0, :cond_4

    .line 15
    sget-object p1, Lcom/tencent/bugly/proguard/p;->a:Lcom/tencent/bugly/proguard/p;

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/p;->a()I

    goto/16 :goto_7

    .line 16
    :cond_4
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-ne p2, v0, :cond_12

    .line 17
    sget-object p2, Lcom/tencent/bugly/proguard/p;->a:Lcom/tencent/bugly/proguard/p;

    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tencent/bugly/proguard/z;

    iget-wide v1, p1, Lcom/tencent/bugly/proguard/z;->e:J

    invoke-virtual {p2, v1, v2}, Lcom/tencent/bugly/proguard/p;->a(J)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_7

    :cond_5
    :goto_2
    monitor-exit p0

    return-void

    .line 18
    :cond_6
    :try_start_3
    iget-object v2, p0, Lcom/tencent/bugly/beta/upgrade/a;->c:[Ljava/lang/Object;

    aget-object v2, v2, v7

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    .line 19
    iget-object v5, p0, Lcom/tencent/bugly/beta/upgrade/a;->c:[Ljava/lang/Object;

    aget-object v5, v5, v0

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    .line 20
    iget v6, p0, Lcom/tencent/bugly/beta/upgrade/a;->b:I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const/16 v8, 0x324

    if-eq v6, v8, :cond_7

    monitor-exit p0

    return-void

    :cond_7
    const/4 v6, 0x0

    if-eqz p7, :cond_8

    if-eqz p2, :cond_8

    .line 21
    :try_start_4
    iget-object p2, p2, Lcom/tencent/bugly/proguard/qa;->e:[B

    array-length v8, p2

    if-eqz v8, :cond_8

    .line 22
    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/ca;->a([BI)[B

    move-result-object p2

    .line 23
    const-class v8, Lcom/tencent/bugly/proguard/D;

    .line 24
    invoke-static {p2, v8}, Lcom/tencent/bugly/proguard/M;->a([BLjava/lang/Class;)Lcom/tencent/bugly/proguard/m;

    move-result-object p2

    check-cast p2, Lcom/tencent/bugly/proguard/D;

    if-eqz p2, :cond_8

    .line 25
    iget-object v8, p2, Lcom/tencent/bugly/proguard/D;->d:Lcom/tencent/bugly/proguard/sa;

    .line 26
    iget-object p2, p2, Lcom/tencent/bugly/proguard/D;->e:Lcom/tencent/bugly/proguard/B;

    goto :goto_3

    :cond_8
    move-object p2, v6

    move-object v8, p2

    .line 27
    :goto_3
    sget-object v9, Lcom/tencent/bugly/beta/upgrade/d;->a:Lcom/tencent/bugly/beta/upgrade/d;

    invoke-virtual {v9, v8}, Lcom/tencent/bugly/beta/upgrade/d;->a(Lcom/tencent/bugly/proguard/sa;)V

    .line 28
    iget-object v8, p0, Lcom/tencent/bugly/beta/upgrade/a;->c:[Ljava/lang/Object;

    aget-object v8, v8, p1

    check-cast v8, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    if-eqz p2, :cond_9

    move-object v6, p2

    goto :goto_4

    :cond_9
    if-eqz v8, :cond_a

    .line 29
    iget-object v6, v8, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    :cond_a
    :goto_4
    const/4 v8, 0x5

    const/16 v9, 0x12

    if-eqz v6, :cond_10

    .line 30
    iget v6, v6, Lcom/tencent/bugly/proguard/B;->u:I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    const/4 v10, -0x1

    if-eq v6, v0, :cond_e

    if-eq v6, p1, :cond_12

    if-eq v6, v3, :cond_b

    :try_start_5
    const-string p1, "unexpected updatetype"
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 31
    :try_start_6
    new-array p2, v7, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    goto/16 :goto_7

    .line 32
    :cond_b
    sget-object v6, Lcom/tencent/bugly/proguard/r;->a:Lcom/tencent/bugly/proguard/r;

    if-eqz p7, :cond_c

    const/4 v10, 0x0

    :cond_c
    invoke-virtual {v6, v10, p2, v7}, Lcom/tencent/bugly/proguard/r;->a(ILcom/tencent/bugly/proguard/B;Z)V

    .line 33
    sget-object p2, Lcom/tencent/bugly/beta/upgrade/d;->a:Lcom/tencent/bugly/beta/upgrade/d;

    iget-object p2, p2, Lcom/tencent/bugly/beta/upgrade/d;->f:Lcom/tencent/bugly/beta/upgrade/UpgradeStateListener;

    if-eqz p2, :cond_d

    .line 34
    new-instance v4, Lcom/tencent/bugly/beta/global/d;

    .line 35
    new-array v3, v3, [Ljava/lang/Object;

    aput-object p2, v3, v7

    aput-object v1, v3, v0

    aput-object v2, v3, p1

    invoke-direct {v4, v9, v3}, Lcom/tencent/bugly/beta/global/d;-><init>(I[Ljava/lang/Object;)V

    .line 36
    invoke-static {v4}, Lcom/tencent/bugly/beta/utils/e;->a(Ljava/lang/Runnable;)V

    goto :goto_7

    :cond_d
    if-eqz v4, :cond_12

    if-nez v5, :cond_12

    .line 37
    new-instance p1, Lcom/tencent/bugly/beta/global/d;

    new-array p2, v0, [Ljava/lang/Object;

    sget-object v1, Lcom/tencent/bugly/beta/Beta;->strToastYourAreTheLatestVersion:Ljava/lang/String;

    aput-object v1, p2, v7

    invoke-direct {p1, v8, p2}, Lcom/tencent/bugly/beta/global/d;-><init>(I[Ljava/lang/Object;)V

    invoke-static {p1}, Lcom/tencent/bugly/beta/utils/e;->a(Ljava/lang/Runnable;)V

    goto :goto_7

    .line 38
    :cond_e
    sget-object p1, Lcom/tencent/bugly/beta/upgrade/d;->a:Lcom/tencent/bugly/beta/upgrade/d;

    if-eqz p7, :cond_f

    const/16 p5, 0x0

    :goto_5
    move-object/from16 p6, p2

    move-object/from16 p7, p8

    move p3, v4

    move p4, v5

    move-object p2, p1

    goto :goto_6

    :cond_f
    const/16 p5, -0x1

    goto :goto_5

    :goto_6
    invoke-virtual/range {p2 .. p7}, Lcom/tencent/bugly/beta/upgrade/d;->a(ZZILcom/tencent/bugly/proguard/B;Ljava/lang/String;)V

    goto :goto_7

    :cond_10
    move p2, v4

    move v4, v5

    .line 39
    sget-object v5, Lcom/tencent/bugly/beta/upgrade/d;->a:Lcom/tencent/bugly/beta/upgrade/d;

    iget-object v5, v5, Lcom/tencent/bugly/beta/upgrade/d;->f:Lcom/tencent/bugly/beta/upgrade/UpgradeStateListener;

    if-eqz v5, :cond_11

    .line 40
    new-instance p2, Lcom/tencent/bugly/beta/global/d;

    .line 41
    new-array v3, v3, [Ljava/lang/Object;

    aput-object v5, v3, v7

    aput-object v1, v3, v0

    aput-object v2, v3, p1

    invoke-direct {p2, v9, v3}, Lcom/tencent/bugly/beta/global/d;-><init>(I[Ljava/lang/Object;)V

    .line 42
    invoke-static {p2}, Lcom/tencent/bugly/beta/utils/e;->a(Ljava/lang/Runnable;)V

    goto :goto_7

    :cond_11
    if-eqz p2, :cond_12

    if-nez v4, :cond_12

    .line 43
    new-instance p1, Lcom/tencent/bugly/beta/global/d;

    new-array p2, v0, [Ljava/lang/Object;

    sget-object v1, Lcom/tencent/bugly/beta/Beta;->strToastYourAreTheLatestVersion:Ljava/lang/String;

    aput-object v1, p2, v7

    invoke-direct {p1, v8, p2}, Lcom/tencent/bugly/beta/global/d;-><init>(I[Ljava/lang/Object;)V

    invoke-static {p1}, Lcom/tencent/bugly/beta/utils/e;->a(Ljava/lang/Runnable;)V

    .line 44
    :cond_12
    :goto_7
    iput-boolean v0, p0, Lcom/tencent/bugly/beta/upgrade/a;->d:Z
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_9

    .line 45
    :goto_8
    :try_start_7
    invoke-static {p1}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/Throwable;)Z

    move-result p2

    if-nez p2, :cond_13

    .line 46
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :cond_13
    :goto_9
    monitor-exit p0

    return-void

    :goto_a
    :try_start_8
    monitor-exit p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    throw p1
.end method
