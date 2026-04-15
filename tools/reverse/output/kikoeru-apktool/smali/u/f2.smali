.class public final Lu/f2;
.super Lac/h;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public c:J

.field public d:I

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Lc2/t;


# direct methods
.method public constructor <init>(Lc2/t;Lyb/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu/f2;->f:Lc2/t;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lac/h;-><init>(ILyb/c;)V

    .line 5
    .line 6
    .line 7
    return-void
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
.method public final o(Ljava/lang/Object;Lyb/c;)Lyb/c;
    .locals 2

    .line 1
    new-instance v0, Lu/f2;

    .line 2
    .line 3
    iget-object v1, p0, Lu/f2;->f:Lc2/t;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lu/f2;-><init>(Lc2/t;Lyb/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lu/f2;->e:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
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

.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lc2/i0;

    .line 2
    .line 3
    check-cast p2, Lyb/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lu/f2;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lu/f2;

    .line 10
    .line 11
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lu/f2;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
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

.method public final u(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lu/f2;->d:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-wide v2, p0, Lu/f2;->c:J

    .line 9
    .line 10
    iget-object v0, p0, Lu/f2;->e:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lc2/i0;

    .line 13
    .line 14
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1

    .line 26
    :cond_1
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lu/f2;->e:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, Lc2/i0;

    .line 32
    .line 33
    iget-object v0, p0, Lu/f2;->f:Lc2/t;

    .line 34
    .line 35
    iget-wide v2, v0, Lc2/t;->b:J

    .line 36
    .line 37
    invoke-virtual {p1}, Lc2/i0;->d()Lj2/z2;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    const-wide/16 v4, 0x28

    .line 45
    .line 46
    add-long/2addr v4, v2

    .line 47
    move-object v0, p1

    .line 48
    move-wide v2, v4

    .line 49
    :cond_2
    iput-object v0, p0, Lu/f2;->e:Ljava/lang/Object;

    .line 50
    .line 51
    iput-wide v2, p0, Lu/f2;->c:J

    .line 52
    .line 53
    iput v1, p0, Lu/f2;->d:I

    .line 54
    .line 55
    const/4 p1, 0x3

    .line 56
    invoke-static {v0, p0, p1}, Lu/n2;->c(Lc2/i0;Lyb/c;I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    sget-object v4, Lzb/a;->a:Lzb/a;

    .line 61
    .line 62
    if-ne p1, v4, :cond_3

    .line 63
    .line 64
    return-object v4

    .line 65
    :cond_3
    :goto_0
    check-cast p1, Lc2/t;

    .line 66
    .line 67
    iget-wide v4, p1, Lc2/t;->b:J

    .line 68
    .line 69
    cmp-long v6, v4, v2

    .line 70
    .line 71
    if-ltz v6, :cond_2

    .line 72
    .line 73
    return-object p1
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
