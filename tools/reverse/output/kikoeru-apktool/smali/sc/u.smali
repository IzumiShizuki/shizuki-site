.class public abstract Lsc/u;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lpc/b;
.implements Lsc/x1;


# instance fields
.field public final a:Lsc/z1;

.field public final b:Lsc/z1;

.field public final c:Lsc/z1;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lsc/r;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Lsc/r;-><init>(Lsc/u;I)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {v1, v0}, Lnd/h;->r(Lyc/c;Lic/a;)Lsc/z1;

    .line 12
    .line 13
    .line 14
    new-instance v0, Lsc/r;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    invoke-direct {v0, p0, v2}, Lsc/r;-><init>(Lsc/u;I)V

    .line 18
    .line 19
    .line 20
    invoke-static {v1, v0}, Lnd/h;->r(Lyc/c;Lic/a;)Lsc/z1;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lsc/u;->a:Lsc/z1;

    .line 25
    .line 26
    new-instance v0, Lsc/r;

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-direct {v0, p0, v2}, Lsc/r;-><init>(Lsc/u;I)V

    .line 30
    .line 31
    .line 32
    invoke-static {v1, v0}, Lnd/h;->r(Lyc/c;Lic/a;)Lsc/z1;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, Lsc/u;->b:Lsc/z1;

    .line 37
    .line 38
    new-instance v0, Lsc/r;

    .line 39
    .line 40
    const/4 v2, 0x4

    .line 41
    invoke-direct {v0, p0, v2}, Lsc/r;-><init>(Lsc/u;I)V

    .line 42
    .line 43
    .line 44
    invoke-static {v1, v0}, Lnd/h;->r(Lyc/c;Lic/a;)Lsc/z1;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, Lsc/u;->c:Lsc/z1;

    .line 49
    .line 50
    new-instance v0, Lsc/r;

    .line 51
    .line 52
    const/4 v2, 0x5

    .line 53
    invoke-direct {v0, p0, v2}, Lsc/r;-><init>(Lsc/u;I)V

    .line 54
    .line 55
    .line 56
    invoke-static {v1, v0}, Lnd/h;->r(Lyc/c;Lic/a;)Lsc/z1;

    .line 57
    .line 58
    .line 59
    new-instance v0, Lsc/r;

    .line 60
    .line 61
    const/4 v2, 0x6

    .line 62
    invoke-direct {v0, p0, v2}, Lsc/r;-><init>(Lsc/u;I)V

    .line 63
    .line 64
    .line 65
    invoke-static {v1, v0}, Lnd/h;->r(Lyc/c;Lic/a;)Lsc/z1;

    .line 66
    .line 67
    .line 68
    new-instance v0, Lsc/r;

    .line 69
    .line 70
    const/4 v1, 0x7

    .line 71
    invoke-direct {v0, p0, v1}, Lsc/r;-><init>(Lsc/u;I)V

    .line 72
    .line 73
    .line 74
    sget-object v1, Lub/i;->a:Lub/i;

    .line 75
    .line 76
    invoke-static {v1, v0}, Lub/a;->c(Lub/i;Lic/a;)Lub/h;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iput-object v0, p0, Lsc/u;->d:Ljava/lang/Object;

    .line 81
    .line 82
    return-void
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
.end method


# virtual methods
.method public final varargs h([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lsc/u;->i()Ltc/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Ltc/g;->d([Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object p1

    .line 10
    :catch_0
    move-exception p1

    .line 11
    new-instance v0, Lqc/a;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    throw v0
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

.method public abstract i()Ltc/g;
.end method

.method public abstract j()Lsc/i0;
.end method

.method public abstract m()Ltc/g;
.end method

.method public final n()Lpc/v;
    .locals 2

    .line 1
    iget-object v0, p0, Lsc/u;->c:Lsc/z1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lsc/z1;->b()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "invoke(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lpc/v;

    .line 13
    .line 14
    return-object v0
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

.method public final o()Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, Lsc/u;->b:Lsc/z1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lsc/z1;->b()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "invoke(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Ljava/util/List;

    .line 13
    .line 14
    return-object v0
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

.method public abstract r()Lyc/c;
.end method

.method public final s()Z
    .locals 2

    .line 1
    invoke-interface {p0}, Lpc/b;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "<init>"

    .line 6
    .line 7
    invoke-static {v0, v1}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lsc/u;->j()Lsc/i0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Ljc/e;->b()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Class;->isAnnotation()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    return v0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    return v0
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
.end method

.method public abstract t()Z
.end method
