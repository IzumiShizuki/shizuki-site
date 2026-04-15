.class public final synthetic Lda/c;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lda/m0;

.field public final synthetic c:Lbg/o0;

.field public final synthetic d:Lda/b;

.field public final synthetic e:I

.field public final synthetic f:Le7/a0;


# direct methods
.method public synthetic constructor <init>(Lbg/o0;Lda/m0;Lda/b;ILe7/a0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lda/c;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lda/c;->c:Lbg/o0;

    iput-object p2, p0, Lda/c;->b:Lda/m0;

    iput-object p3, p0, Lda/c;->d:Lda/b;

    iput p4, p0, Lda/c;->e:I

    iput-object p5, p0, Lda/c;->f:Le7/a0;

    return-void
.end method

.method public synthetic constructor <init>(Lda/m0;Lbg/o0;Lda/b;ILe7/a0;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lda/c;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lda/c;->b:Lda/m0;

    iput-object p2, p0, Lda/c;->c:Lbg/o0;

    iput-object p3, p0, Lda/c;->d:Lda/b;

    iput p4, p0, Lda/c;->e:I

    iput-object p5, p0, Lda/c;->f:Le7/a0;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lda/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lda/c;->d:Lda/b;

    .line 7
    .line 8
    iget-object v1, v0, Lda/b;->e:Ljava/util/List;

    .line 9
    .line 10
    iget v2, p0, Lda/c;->e:I

    .line 11
    .line 12
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lda/b;

    .line 17
    .line 18
    iget-object v2, p0, Lda/c;->b:Lda/m0;

    .line 19
    .line 20
    iget-object v3, p0, Lda/c;->c:Lbg/o0;

    .line 21
    .line 22
    iget-object v4, p0, Lda/c;->f:Le7/a0;

    .line 23
    .line 24
    invoke-virtual {v2, v3, v1, v0, v4}, Lda/m0;->W(Lbg/o0;Lda/b;Lda/b;Le7/a0;)V

    .line 25
    .line 26
    .line 27
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-static {}, Lgg/c;->a()Lhg/a;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 37
    .line 38
    const-string v3, "enableLongClickItemCopy"

    .line 39
    .line 40
    invoke-static {v2, v1, v3, v0}, La0/c;->F(Ljava/lang/Class;Lhg/a;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Ljava/lang/Boolean;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-object v1, p0, Lda/c;->c:Lbg/o0;

    .line 51
    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    invoke-virtual {v1}, Lbg/o0;->a()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {v0}, Lna/q;->f(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    iget-object v0, p0, Lda/c;->d:Lda/b;

    .line 63
    .line 64
    iget-object v2, v0, Lda/b;->e:Ljava/util/List;

    .line 65
    .line 66
    iget v3, p0, Lda/c;->e:I

    .line 67
    .line 68
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    check-cast v2, Lda/b;

    .line 73
    .line 74
    iget-object v3, p0, Lda/c;->b:Lda/m0;

    .line 75
    .line 76
    iget-object v4, p0, Lda/c;->f:Le7/a0;

    .line 77
    .line 78
    invoke-virtual {v3, v1, v2, v0, v4}, Lda/m0;->W(Lbg/o0;Lda/b;Lda/b;Le7/a0;)V

    .line 79
    .line 80
    .line 81
    :goto_0
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 82
    .line 83
    return-object v0

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
