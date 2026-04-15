.class public final La0/d0;
.super Lac/i;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:La0/g0;

.field public g:I


# direct methods
.method public constructor <init>(La0/g0;ILyb/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, La0/d0;->e:I

    .line 1
    iput-object p1, p0, La0/d0;->f:La0/g0;

    iput p2, p0, La0/d0;->g:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method

.method public constructor <init>(La0/g0;Lyb/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, La0/d0;->e:I

    .line 2
    iput-object p1, p0, La0/d0;->f:La0/g0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method


# virtual methods
.method public final o(Ljava/lang/Object;Lyb/c;)Lyb/c;
    .locals 2

    .line 1
    iget p1, p0, La0/d0;->e:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, La0/d0;

    .line 7
    .line 8
    iget-object v0, p0, La0/d0;->f:La0/g0;

    .line 9
    .line 10
    iget v1, p0, La0/d0;->g:I

    .line 11
    .line 12
    invoke-direct {p1, v0, v1, p2}, La0/d0;-><init>(La0/g0;ILyb/c;)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :pswitch_0
    new-instance p1, La0/d0;

    .line 17
    .line 18
    iget-object v0, p0, La0/d0;->f:La0/g0;

    .line 19
    .line 20
    invoke-direct {p1, v0, p2}, La0/d0;-><init>(La0/g0;Lyb/c;)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
    .locals 1

    .line 1
    iget v0, p0, La0/d0;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lu/k1;

    .line 7
    .line 8
    check-cast p2, Lyb/c;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La0/d0;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, La0/d0;

    .line 15
    .line 16
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, La0/d0;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object p2

    .line 22
    :pswitch_0
    check-cast p1, Lhf/y;

    .line 23
    .line 24
    check-cast p2, Lyb/c;

    .line 25
    .line 26
    invoke-virtual {p0, p1, p2}, La0/d0;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, La0/d0;

    .line 31
    .line 32
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 33
    .line 34
    invoke-virtual {p1, p2}, La0/d0;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
    .locals 4

    .line 1
    iget v0, p0, La0/d0;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget p1, p0, La0/d0;->g:I

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    const/4 v1, 0x1

    .line 13
    iget-object v2, p0, La0/d0;->f:La0/g0;

    .line 14
    .line 15
    invoke-virtual {v2, p1, v0, v1}, La0/g0;->i(IIZ)V

    .line 16
    .line 17
    .line 18
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_0
    iget v0, p0, La0/d0;->g:I

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    if-ne v0, v1, :cond_0

    .line 27
    .line 28
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1

    .line 40
    :cond_1
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    new-instance p1, La0/c0;

    .line 44
    .line 45
    const/4 v0, 0x2

    .line 46
    const/4 v2, 0x0

    .line 47
    const/4 v3, 0x0

    .line 48
    invoke-direct {p1, v0, v3, v2}, La0/c0;-><init>(ILyb/c;I)V

    .line 49
    .line 50
    .line 51
    iput v1, p0, La0/d0;->g:I

    .line 52
    .line 53
    sget-object v0, Ls/v0;->a:Ls/v0;

    .line 54
    .line 55
    iget-object v1, p0, La0/d0;->f:La0/g0;

    .line 56
    .line 57
    invoke-virtual {v1, v0, p1, p0}, La0/g0;->b(Ls/v0;Lic/n;Lac/c;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    sget-object v0, Lzb/a;->a:Lzb/a;

    .line 62
    .line 63
    if-ne p1, v0, :cond_2

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    :goto_0
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 67
    .line 68
    :goto_1
    return-object v0

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
