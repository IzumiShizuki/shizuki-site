.class public final synthetic Lda/i;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Le7/a0;

.field public final synthetic c:Lbg/a2;


# direct methods
.method public synthetic constructor <init>(Lbg/a2;Le7/a0;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Lda/i;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lda/i;->c:Lbg/a2;

    iput-object p2, p0, Lda/i;->b:Le7/a0;

    return-void
.end method

.method public synthetic constructor <init>(Le7/a0;Lbg/a2;I)V
    .locals 0

    .line 2
    iput p3, p0, Lda/i;->a:I

    iput-object p1, p0, Lda/i;->b:Le7/a0;

    iput-object p2, p0, Lda/i;->c:Lbg/a2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lda/i;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lda/i;->b:Le7/a0;

    .line 7
    .line 8
    iget-object v1, p0, Lda/i;->c:Lbg/a2;

    .line 9
    .line 10
    iget-object v1, v1, Lbg/a2;->a:Lbg/c;

    .line 11
    .line 12
    invoke-static {v0, v1}, Lla/d0;->g(Le7/a0;Lbg/t;)V

    .line 13
    .line 14
    .line 15
    :goto_0
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_0
    iget-object v0, p0, Lda/i;->c:Lbg/a2;

    .line 19
    .line 20
    iget-object v1, v0, Lbg/a2;->I:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v1}, Lna/w;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {v0}, Lna/c;->l(Lbg/a2;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v2, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v3, "PictureScreen/"

    .line 33
    .line 34
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, "/"

    .line 41
    .line 42
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-object v1, p0, Lda/i;->b:Le7/a0;

    .line 53
    .line 54
    invoke-static {v1, v0}, Le7/a0;->b(Le7/a0;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :pswitch_1
    iget-object v0, p0, Lda/i;->c:Lbg/a2;

    .line 59
    .line 60
    iget-object v1, v0, Lbg/a2;->I:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v1}, Lna/w;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    iget-wide v2, v0, Lbg/a2;->f:J

    .line 67
    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    const-string v4, "PictureScreen/"

    .line 71
    .line 72
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v1, "/RJ"

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    iget-object v1, p0, Lda/i;->b:Le7/a0;

    .line 91
    .line 92
    invoke-static {v1, v0}, Le7/a0;->b(Le7/a0;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 98
.end method
