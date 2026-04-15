.class public final Lyf/q;
.super Lac/h;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/o;


# instance fields
.field public c:I

.field public synthetic d:Lub/b;

.field public final synthetic e:Lb7/m;


# direct methods
.method public constructor <init>(Lb7/m;Lyb/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyf/q;->e:Lb7/m;

    .line 2
    .line 3
    const/4 p1, 0x3

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
.method public final g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lub/b;

    .line 2
    .line 3
    check-cast p2, Lub/a0;

    .line 4
    .line 5
    check-cast p3, Lyb/c;

    .line 6
    .line 7
    new-instance p2, Lyf/q;

    .line 8
    .line 9
    iget-object v0, p0, Lyf/q;->e:Lb7/m;

    .line 10
    .line 11
    invoke-direct {p2, v0, p3}, Lyf/q;-><init>(Lb7/m;Lyb/c;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p2, Lyf/q;->d:Lub/b;

    .line 15
    .line 16
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 17
    .line 18
    invoke-virtual {p2, p1}, Lyf/q;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
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

.method public final u(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lyf/q;->e:Lb7/m;

    .line 2
    .line 3
    iget-object v1, v0, Lb7/m;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lh7/k;

    .line 6
    .line 7
    iget-object v2, p0, Lyf/q;->d:Lub/b;

    .line 8
    .line 9
    iget v3, p0, Lyf/q;->c:I

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    if-eqz v3, :cond_1

    .line 13
    .line 14
    if-ne v3, v4, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Lh7/k;->x()B

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-ne p1, v4, :cond_2

    .line 36
    .line 37
    invoke-virtual {v0, v4}, Lb7/m;->t(Z)Lxf/c0;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1

    .line 42
    :cond_2
    const/4 v3, 0x0

    .line 43
    if-nez p1, :cond_3

    .line 44
    .line 45
    invoke-virtual {v0, v3}, Lb7/m;->t(Z)Lxf/c0;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    return-object p1

    .line 50
    :cond_3
    const/4 v5, 0x6

    .line 51
    const/4 v6, 0x0

    .line 52
    if-ne p1, v5, :cond_5

    .line 53
    .line 54
    iput-object v6, p0, Lyf/q;->d:Lub/b;

    .line 55
    .line 56
    iput v4, p0, Lyf/q;->c:I

    .line 57
    .line 58
    invoke-static {v0, v2, p0}, Lb7/m;->e(Lb7/m;Lub/b;Lac/a;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    sget-object v0, Lzb/a;->a:Lzb/a;

    .line 63
    .line 64
    if-ne p1, v0, :cond_4

    .line 65
    .line 66
    return-object v0

    .line 67
    :cond_4
    :goto_0
    check-cast p1, Lxf/m;

    .line 68
    .line 69
    return-object p1

    .line 70
    :cond_5
    const/16 v2, 0x8

    .line 71
    .line 72
    if-ne p1, v2, :cond_6

    .line 73
    .line 74
    invoke-virtual {v0}, Lb7/m;->r()Lxf/e;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    return-object p1

    .line 79
    :cond_6
    const-string p1, "Can\'t begin reading element, unexpected token"

    .line 80
    .line 81
    invoke-static {v1, p1, v3, v6, v5}, Lh7/k;->q(Lh7/k;Ljava/lang/String;ILjava/lang/String;I)V

    .line 82
    .line 83
    .line 84
    throw v6
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
