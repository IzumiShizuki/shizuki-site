.class public final Lbd/b;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lbd/c;


# direct methods
.method public synthetic constructor <init>(Lbd/c;I)V
    .locals 0

    .line 1
    iput p2, p0, Lbd/b;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lbd/b;->b:Lbd/c;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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
.method public final b()Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lbd/b;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lbd/b;->b:Lbd/c;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Lbd/a0;

    .line 9
    .line 10
    invoke-direct {v0, v1}, Lbd/a0;-><init>(Lyc/e;)V

    .line 11
    .line 12
    .line 13
    return-object v0

    .line 14
    :pswitch_0
    new-instance v0, Lle/i;

    .line 15
    .line 16
    invoke-virtual {v1}, Lbd/c;->N0()Lle/o;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-direct {v0, v1}, Lle/i;-><init>(Lle/o;)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_1
    invoke-virtual {v1}, Lbd/c;->N0()Lle/o;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    new-instance v7, Lbd/a;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    invoke-direct {v7, v0, p0}, Lbd/a;-><init>(ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    sget-object v0, Lse/u0;->a:Lue/i;

    .line 35
    .line 36
    invoke-static {v1}, Lue/l;->f(Lyc/k;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    filled-new-array {v0}, [Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    sget-object v1, Lue/k;->k:Lue/k;

    .line 51
    .line 52
    invoke-static {v1, v0}, Lue/l;->c(Lue/k;[Ljava/lang/String;)Lue/i;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    invoke-interface {v1}, Lyc/h;->Q()Lse/k0;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    const/4 v0, 0x0

    .line 62
    if-eqz v3, :cond_2

    .line 63
    .line 64
    if-eqz v6, :cond_1

    .line 65
    .line 66
    invoke-interface {v3}, Lse/k0;->o()Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v0}, Lse/u0;->d(Ljava/util/List;)Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    sget-object v0, Lse/h0;->b:Lm0/w;

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    sget-object v2, Lse/h0;->c:Lse/h0;

    .line 80
    .line 81
    const/4 v5, 0x0

    .line 82
    invoke-static/range {v2 .. v7}, Lse/c;->x(Lse/h0;Lse/k0;Ljava/util/List;ZLle/o;Lic/k;)Lse/a0;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    :goto_0
    return-object v0

    .line 87
    :cond_1
    const/16 v1, 0xd

    .line 88
    .line 89
    invoke-static {v1}, Lse/u0;->a(I)V

    .line 90
    .line 91
    .line 92
    throw v0

    .line 93
    :cond_2
    const/16 v1, 0xc

    .line 94
    .line 95
    invoke-static {v1}, Lse/u0;->a(I)V

    .line 96
    .line 97
    .line 98
    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
