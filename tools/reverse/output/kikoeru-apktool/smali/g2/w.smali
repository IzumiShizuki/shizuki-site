.class public final Lg2/w;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final synthetic a:I

.field public final b:Lg2/v;

.field public final c:Lg2/v;

.field public final d:Lg2/v;

.field public final e:Lg2/v;

.field public final f:Ljava/io/Serializable;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lg2/w;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg2/w;->f:Ljava/io/Serializable;

    .line 2
    new-instance p1, Lg2/v;

    const/4 v1, 0x0

    .line 3
    invoke-direct {p1, v0, v1}, Lg2/v;-><init>(ILic/n;)V

    .line 4
    iput-object p1, p0, Lg2/w;->b:Lg2/v;

    .line 5
    new-instance p1, Lg2/v;

    const/4 v0, 0x0

    .line 6
    invoke-direct {p1, v0, v1}, Lg2/v;-><init>(ILic/n;)V

    .line 7
    iput-object p1, p0, Lg2/w;->c:Lg2/v;

    .line 8
    new-instance p1, Lg2/v;

    const/4 v0, 0x1

    .line 9
    invoke-direct {p1, v0, v1}, Lg2/v;-><init>(ILic/n;)V

    .line 10
    iput-object p1, p0, Lg2/w;->d:Lg2/v;

    .line 11
    new-instance p1, Lg2/v;

    const/4 v0, 0x0

    .line 12
    invoke-direct {p1, v0, v1}, Lg2/v;-><init>(ILic/n;)V

    .line 13
    iput-object p1, p0, Lg2/w;->e:Lg2/v;

    return-void
.end method

.method public constructor <init>([Lg2/w;)V
    .locals 4

    const/4 v0, 0x0

    iput v0, p0, Lg2/w;->a:I

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg2/w;->f:Ljava/io/Serializable;

    .line 15
    array-length p1, p1

    new-array v0, p1, [Lg2/v;

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_0

    iget-object v3, p0, Lg2/w;->f:Ljava/io/Serializable;

    check-cast v3, [Lg2/w;

    aget-object v3, v3, v2

    invoke-virtual {v3}, Lg2/w;->b()Lg2/v;

    move-result-object v3

    aput-object v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Lg2/u1;

    const/4 v2, 0x0

    invoke-direct {p1, v0, v2}, Lg2/u1;-><init>([Lg2/v;I)V

    .line 17
    new-instance v0, Lg2/v;

    const/4 v2, 0x1

    .line 18
    invoke-direct {v0, v2, p1}, Lg2/v;-><init>(ILic/n;)V

    .line 19
    iput-object v0, p0, Lg2/w;->b:Lg2/v;

    .line 20
    iget-object p1, p0, Lg2/w;->f:Ljava/io/Serializable;

    check-cast p1, [Lg2/w;

    array-length p1, p1

    new-array v0, p1, [Lg2/v;

    const/4 v2, 0x0

    :goto_1
    if-ge v2, p1, :cond_1

    iget-object v3, p0, Lg2/w;->f:Ljava/io/Serializable;

    check-cast v3, [Lg2/w;

    aget-object v3, v3, v2

    invoke-virtual {v3}, Lg2/w;->d()Lg2/v;

    move-result-object v3

    aput-object v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 21
    :cond_1
    new-instance p1, Lg2/v;

    new-instance v2, Lg2/u;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lg2/u;-><init>([Lg2/v;I)V

    const/4 v0, 0x0

    .line 22
    invoke-direct {p1, v0, v2}, Lg2/v;-><init>(ILic/n;)V

    .line 23
    iput-object p1, p0, Lg2/w;->c:Lg2/v;

    .line 24
    iget-object p1, p0, Lg2/w;->f:Ljava/io/Serializable;

    check-cast p1, [Lg2/w;

    array-length p1, p1

    new-array v0, p1, [Lg2/v;

    const/4 v2, 0x0

    :goto_2
    if-ge v2, p1, :cond_2

    iget-object v3, p0, Lg2/w;->f:Ljava/io/Serializable;

    check-cast v3, [Lg2/w;

    aget-object v3, v3, v2

    invoke-virtual {v3}, Lg2/w;->c()Lg2/v;

    move-result-object v3

    aput-object v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 25
    :cond_2
    new-instance p1, Lg2/u1;

    const/4 v2, 0x1

    invoke-direct {p1, v0, v2}, Lg2/u1;-><init>([Lg2/v;I)V

    .line 26
    new-instance v0, Lg2/v;

    .line 27
    invoke-direct {v0, v2, p1}, Lg2/v;-><init>(ILic/n;)V

    .line 28
    iput-object v0, p0, Lg2/w;->d:Lg2/v;

    .line 29
    iget-object p1, p0, Lg2/w;->f:Ljava/io/Serializable;

    check-cast p1, [Lg2/w;

    array-length p1, p1

    new-array v0, p1, [Lg2/v;

    :goto_3
    if-ge v1, p1, :cond_3

    iget-object v2, p0, Lg2/w;->f:Ljava/io/Serializable;

    check-cast v2, [Lg2/w;

    aget-object v2, v2, v1

    invoke-virtual {v2}, Lg2/w;->a()Lg2/v;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 30
    :cond_3
    new-instance p1, Lg2/v;

    new-instance v1, Lg2/u;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Lg2/u;-><init>([Lg2/v;I)V

    const/4 v0, 0x0

    .line 31
    invoke-direct {p1, v0, v1}, Lg2/v;-><init>(ILic/n;)V

    .line 32
    iput-object p1, p0, Lg2/w;->e:Lg2/v;

    return-void
.end method


# virtual methods
.method public final a()Lg2/v;
    .locals 1

    .line 1
    iget v0, p0, Lg2/w;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg2/w;->e:Lg2/v;

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    iget-object v0, p0, Lg2/w;->e:Lg2/v;

    .line 10
    .line 11
    return-object v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final b()Lg2/v;
    .locals 1

    .line 1
    iget v0, p0, Lg2/w;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg2/w;->b:Lg2/v;

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    iget-object v0, p0, Lg2/w;->b:Lg2/v;

    .line 10
    .line 11
    return-object v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final c()Lg2/v;
    .locals 1

    .line 1
    iget v0, p0, Lg2/w;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg2/w;->d:Lg2/v;

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    iget-object v0, p0, Lg2/w;->d:Lg2/v;

    .line 10
    .line 11
    return-object v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final d()Lg2/v;
    .locals 1

    .line 1
    iget v0, p0, Lg2/w;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg2/w;->c:Lg2/v;

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    iget-object v0, p0, Lg2/w;->c:Lg2/v;

    .line 10
    .line 11
    return-object v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 1
    iget v0, p0, Lg2/w;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg2/w;->f:Ljava/io/Serializable;

    .line 7
    .line 8
    check-cast v0, Ljava/lang/String;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const-string v1, "RectRulers("

    .line 13
    .line 14
    const/16 v2, 0x29

    .line 15
    .line 16
    invoke-static {v2, v1, v0}, La0/c;->G(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_0
    return-object v0

    .line 26
    :pswitch_0
    iget-object v0, p0, Lg2/w;->f:Ljava/io/Serializable;

    .line 27
    .line 28
    move-object v1, v0

    .line 29
    check-cast v1, [Lg2/w;

    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    const/16 v6, 0x39

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    const-string v3, "innermostOf("

    .line 36
    .line 37
    const-string v4, ")"

    .line 38
    .line 39
    invoke-static/range {v1 .. v6}, Lvb/l;->D0([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lic/k;I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    return-object v0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
