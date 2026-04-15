.class public abstract Lbh/b;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Llh/h0;


# instance fields
.field public final a:Lug/t;

.field public final b:Llh/p;

.field public c:Z

.field public final synthetic d:Lbh/h;


# direct methods
.method public constructor <init>(Lbh/h;Lug/t;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "url"

    .line 5
    .line 6
    invoke-static {p2, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lbh/b;->d:Lbh/h;

    .line 10
    .line 11
    iput-object p2, p0, Lbh/b;->a:Lug/t;

    .line 12
    .line 13
    new-instance p2, Llh/p;

    .line 14
    .line 15
    iget-object p1, p1, Lbh/h;->c:Ltc/b0;

    .line 16
    .line 17
    iget-object p1, p1, Ltc/b0;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p1, Llh/b0;

    .line 20
    .line 21
    iget-object p1, p1, Llh/b0;->a:Llh/h0;

    .line 22
    .line 23
    invoke-interface {p1}, Llh/h0;->a()Llh/j0;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-direct {p2, p1}, Llh/p;-><init>(Llh/j0;)V

    .line 28
    .line 29
    .line 30
    iput-object p2, p0, Lbh/b;->b:Llh/p;

    .line 31
    .line 32
    return-void
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
.method public W(Llh/f;J)J
    .locals 2

    .line 1
    iget-object v0, p0, Lbh/b;->d:Lbh/h;

    .line 2
    .line 3
    const-string v1, "sink"

    .line 4
    .line 5
    invoke-static {p1, v1}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    iget-object v1, v0, Lbh/h;->c:Ltc/b0;

    .line 9
    .line 10
    iget-object v1, v1, Ltc/b0;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Llh/b0;

    .line 13
    .line 14
    invoke-virtual {v1, p1, p2, p3}, Llh/b0;->W(Llh/f;J)J

    .line 15
    .line 16
    .line 17
    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    return-wide p1

    .line 19
    :catch_0
    move-exception p1

    .line 20
    iget-object p2, v0, Lbh/h;->b:Lah/e;

    .line 21
    .line 22
    invoke-interface {p2}, Lah/e;->f()V

    .line 23
    .line 24
    .line 25
    sget-object p2, Lbh/h;->f:Lug/r;

    .line 26
    .line 27
    invoke-virtual {p0, p2}, Lbh/b;->b(Lug/r;)V

    .line 28
    .line 29
    .line 30
    throw p1
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

.method public final a()Llh/j0;
    .locals 1

    .line 1
    iget-object v0, p0, Lbh/b;->b:Llh/p;

    .line 2
    .line 3
    return-object v0
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
.end method

.method public final b(Lug/r;)V
    .locals 5

    .line 1
    const-string v0, "trailers"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lbh/b;->d:Lbh/h;

    .line 7
    .line 8
    iget v1, v0, Lbh/h;->d:I

    .line 9
    .line 10
    const/4 v2, 0x6

    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v3, 0x5

    .line 15
    if-ne v1, v3, :cond_2

    .line 16
    .line 17
    iget-object v1, p0, Lbh/b;->b:Llh/p;

    .line 18
    .line 19
    iget-object v3, v1, Llh/p;->e:Llh/j0;

    .line 20
    .line 21
    sget-object v4, Llh/j0;->d:Llh/i0;

    .line 22
    .line 23
    iput-object v4, v1, Llh/p;->e:Llh/j0;

    .line 24
    .line 25
    invoke-virtual {v3}, Llh/j0;->a()Llh/j0;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3}, Llh/j0;->b()Llh/j0;

    .line 29
    .line 30
    .line 31
    iput v2, v0, Lbh/h;->d:I

    .line 32
    .line 33
    invoke-virtual {p1}, Lug/r;->size()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-lez v1, :cond_1

    .line 38
    .line 39
    iget-object v0, v0, Lbh/h;->a:Lug/x;

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    iget-object v0, v0, Lug/x;->j:Lug/b;

    .line 44
    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    iget-object v1, p0, Lbh/b;->a:Lug/t;

    .line 48
    .line 49
    invoke-static {v0, v1, p1}, Lah/g;->b(Lug/b;Lug/t;Lug/r;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    :goto_0
    return-void

    .line 53
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    new-instance v1, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v2, "state: "

    .line 58
    .line 59
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    iget v0, v0, Lbh/h;->d:I

    .line 63
    .line 64
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p1
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
