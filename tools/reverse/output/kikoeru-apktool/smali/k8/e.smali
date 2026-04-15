.class public final Lk8/e;
.super Llh/n;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final synthetic b:I

.field public c:Z

.field public final d:Lic/k;


# direct methods
.method public constructor <init>(Llh/f0;Le7/y;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lk8/e;->b:I

    .line 1
    invoke-direct {p0, p1}, Llh/n;-><init>(Llh/f0;)V

    .line 2
    iput-object p2, p0, Lk8/e;->d:Lic/k;

    return-void
.end method

.method public constructor <init>(Llh/f0;Lic/k;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lk8/e;->b:I

    const-string v0, "delegate"

    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1}, Llh/n;-><init>(Llh/f0;)V

    .line 4
    iput-object p2, p0, Lk8/e;->d:Lic/k;

    return-void
.end method


# virtual methods
.method public final H(Llh/f;J)V
    .locals 1

    .line 1
    iget v0, p0, Lk8/e;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lk8/e;->c:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1, p2, p3}, Llh/f;->skip(J)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Llh/n;->H(Llh/f;J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catch_0
    move-exception p1

    .line 19
    const/4 p2, 0x1

    .line 20
    iput-boolean p2, p0, Lk8/e;->c:Z

    .line 21
    .line 22
    iget-object p2, p0, Lk8/e;->d:Lic/k;

    .line 23
    .line 24
    invoke-interface {p2, p1}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    :goto_0
    return-void

    .line 28
    :pswitch_0
    iget-boolean v0, p0, Lk8/e;->c:Z

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {p1, p2, p3}, Llh/f;->skip(J)V

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    :try_start_1
    iget-object v0, p0, Llh/n;->a:Llh/f0;

    .line 37
    .line 38
    invoke-interface {v0, p1, p2, p3}, Llh/f0;->H(Llh/f;J)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :catch_1
    move-exception p1

    .line 43
    const/4 p2, 0x1

    .line 44
    iput-boolean p2, p0, Lk8/e;->c:Z

    .line 45
    .line 46
    iget-object p2, p0, Lk8/e;->d:Lic/k;

    .line 47
    .line 48
    check-cast p2, Le7/y;

    .line 49
    .line 50
    invoke-virtual {p2, p1}, Le7/y;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    :goto_1
    return-void

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 56
    .line 57
    .line 58
.end method

.method public final close()V
    .locals 2

    .line 1
    iget v0, p0, Lk8/e;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-super {p0}, Llh/n;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catch_0
    move-exception v0

    .line 11
    const/4 v1, 0x1

    .line 12
    iput-boolean v1, p0, Lk8/e;->c:Z

    .line 13
    .line 14
    iget-object v1, p0, Lk8/e;->d:Lic/k;

    .line 15
    .line 16
    invoke-interface {v1, v0}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    :goto_0
    return-void

    .line 20
    :pswitch_0
    :try_start_1
    invoke-super {p0}, Llh/n;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 21
    .line 22
    .line 23
    goto :goto_1

    .line 24
    :catch_1
    move-exception v0

    .line 25
    const/4 v1, 0x1

    .line 26
    iput-boolean v1, p0, Lk8/e;->c:Z

    .line 27
    .line 28
    iget-object v1, p0, Lk8/e;->d:Lic/k;

    .line 29
    .line 30
    check-cast v1, Le7/y;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Le7/y;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    :goto_1
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method

.method public final flush()V
    .locals 2

    .line 1
    iget v0, p0, Lk8/e;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lk8/e;->c:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    :try_start_0
    invoke-super {p0}, Llh/n;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catch_0
    move-exception v0

    .line 16
    const/4 v1, 0x1

    .line 17
    iput-boolean v1, p0, Lk8/e;->c:Z

    .line 18
    .line 19
    iget-object v1, p0, Lk8/e;->d:Lic/k;

    .line 20
    .line 21
    invoke-interface {v1, v0}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    :goto_0
    return-void

    .line 25
    :pswitch_0
    :try_start_1
    invoke-super {p0}, Llh/n;->flush()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :catch_1
    move-exception v0

    .line 30
    const/4 v1, 0x1

    .line 31
    iput-boolean v1, p0, Lk8/e;->c:Z

    .line 32
    .line 33
    iget-object v1, p0, Lk8/e;->d:Lic/k;

    .line 34
    .line 35
    check-cast v1, Le7/y;

    .line 36
    .line 37
    invoke-virtual {v1, v0}, Le7/y;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    :goto_1
    return-void

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
