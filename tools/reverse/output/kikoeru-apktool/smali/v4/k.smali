.class public final Lv4/k;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lv4/g0;


# instance fields
.field public final a:Lv4/c1;

.field public final b:Lv4/c0;

.field public c:Lv4/e;

.field public d:Lv4/g0;

.field public e:Z

.field public f:Z


# direct methods
.method public constructor <init>(Lv4/c0;Lp4/v;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv4/k;->b:Lv4/c0;

    .line 5
    .line 6
    new-instance p1, Lv4/c1;

    .line 7
    .line 8
    invoke-direct {p1, p2}, Lv4/c1;-><init>(Lp4/v;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lv4/k;->a:Lv4/c1;

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, Lv4/k;->e:Z

    .line 15
    .line 16
    return-void
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


# virtual methods
.method public final a(Lm4/s0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/k;->d:Lv4/g0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lv4/g0;->a(Lm4/s0;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lv4/k;->d:Lv4/g0;

    .line 9
    .line 10
    invoke-interface {p1}, Lv4/g0;->e()Lm4/s0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :cond_0
    iget-object v0, p0, Lv4/k;->a:Lv4/c1;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lv4/c1;->a(Lm4/s0;)V

    .line 17
    .line 18
    .line 19
    return-void
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

.method public final b()J
    .locals 2

    .line 1
    iget-boolean v0, p0, Lv4/k;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lv4/k;->a:Lv4/c1;

    .line 6
    .line 7
    invoke-virtual {v0}, Lv4/c1;->b()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0

    .line 12
    :cond_0
    iget-object v0, p0, Lv4/k;->d:Lv4/g0;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Lv4/g0;->b()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    return-wide v0
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lv4/k;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lv4/k;->a:Lv4/c1;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    return v0

    .line 12
    :cond_0
    iget-object v0, p0, Lv4/k;->d:Lv4/g0;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Lv4/g0;->c()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    return v0
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final d(Lv4/e;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lv4/e;->h()Lv4/g0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, Lv4/k;->d:Lv4/g0;

    .line 8
    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iput-object v0, p0, Lv4/k;->d:Lv4/g0;

    .line 14
    .line 15
    iput-object p1, p0, Lv4/k;->c:Lv4/e;

    .line 16
    .line 17
    iget-object p1, p0, Lv4/k;->a:Lv4/c1;

    .line 18
    .line 19
    iget-object p1, p1, Lv4/c1;->e:Lm4/s0;

    .line 20
    .line 21
    check-cast v0, Lx4/x;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lx4/x;->a(Lm4/s0;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v0, "Multiple renderer media clocks enabled."

    .line 30
    .line 31
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    new-instance v0, Lv4/m;

    .line 35
    .line 36
    const/4 v1, 0x2

    .line 37
    const/16 v2, 0x3e8

    .line 38
    .line 39
    invoke-direct {v0, v1, p1, v2}, Lv4/m;-><init>(ILjava/lang/Exception;I)V

    .line 40
    .line 41
    .line 42
    throw v0

    .line 43
    :cond_1
    return-void
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
.end method

.method public final e()Lm4/s0;
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/k;->d:Lv4/g0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lv4/g0;->e()Lm4/s0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    iget-object v0, p0, Lv4/k;->a:Lv4/c1;

    .line 11
    .line 12
    iget-object v0, v0, Lv4/c1;->e:Lm4/s0;

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
