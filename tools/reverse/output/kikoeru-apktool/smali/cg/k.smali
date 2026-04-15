.class public final Lcg/k;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Z

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lic/k;ZI)V
    .locals 0

    .line 1
    iput p3, p0, Lcg/k;->b:I

    iput-object p1, p0, Lcg/k;->d:Ljava/lang/Object;

    iput-boolean p2, p0, Lcg/k;->c:Z

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(ZLj0/c;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lcg/k;->b:I

    .line 2
    iput-boolean p1, p0, Lcg/k;->c:Z

    iput-object p2, p0, Lcg/k;->d:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lcg/k;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcg/k;->c:Z

    .line 7
    .line 8
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcg/k;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lj0/c;

    .line 15
    .line 16
    invoke-virtual {v0}, Lj0/c;->i()Llf/h0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    check-cast v0, Llf/o0;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Llf/o0;->j(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    :cond_0
    return-object v1

    .line 28
    :pswitch_0
    iget-object v0, p0, Lcg/k;->d:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Lic/k;

    .line 31
    .line 32
    iget-boolean v1, p0, Lcg/k;->c:Z

    .line 33
    .line 34
    xor-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-interface {v0, v1}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 44
    .line 45
    return-object v0

    .line 46
    :pswitch_1
    iget-object v0, p0, Lcg/k;->d:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Lcg/b0;

    .line 49
    .line 50
    iget-boolean v1, p0, Lcg/k;->c:Z

    .line 51
    .line 52
    xor-int/lit8 v1, v1, 0x1

    .line 53
    .line 54
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v0, v1}, Lcg/b0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 62
    .line 63
    return-object v0

    .line 64
    :pswitch_2
    iget-object v0, p0, Lcg/k;->d:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, Lcg/c0;

    .line 67
    .line 68
    iget-boolean v1, p0, Lcg/k;->c:Z

    .line 69
    .line 70
    xor-int/lit8 v1, v1, 0x1

    .line 71
    .line 72
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v0, v1}, Lcg/c0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 80
    .line 81
    return-object v0

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
