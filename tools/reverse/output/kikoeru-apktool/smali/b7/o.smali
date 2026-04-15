.class public final Lb7/o;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lcb/s;


# instance fields
.field public final synthetic a:I

.field public final b:Lm3/c;

.field public final c:Lb7/g1;

.field public d:Z


# direct methods
.method public synthetic constructor <init>(Lm3/c;Lb7/g1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lb7/o;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lb7/o;->b:Lm3/c;

    .line 4
    .line 5
    iput-object p2, p0, Lb7/o;->c:Lb7/g1;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
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


# virtual methods
.method public final d(Ljava/lang/Object;)V
    .locals 7

    .line 1
    iget v0, p0, Lb7/o;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroid/graphics/Bitmap;

    .line 7
    .line 8
    iget-boolean v0, p0, Lb7/o;->d:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lb7/o;->b:Lm3/c;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lm3/c;->d(Landroid/graphics/Bitmap;)V

    .line 15
    .line 16
    .line 17
    new-instance v6, Lb7/m;

    .line 18
    .line 19
    const/16 p1, 0x29a

    .line 20
    .line 21
    invoke-virtual {v0}, Lm3/c;->a()Landroid/app/Notification;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-direct {v6, p1, v0}, Lb7/m;-><init>(ILandroid/app/Notification;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lb7/o;->c:Lb7/g1;

    .line 29
    .line 30
    iget-object v0, p1, Lb7/g1;->b:Ljava/lang/Object;

    .line 31
    .line 32
    move-object v4, v0

    .line 33
    check-cast v4, Lb7/p1;

    .line 34
    .line 35
    iget v2, p1, Lb7/g1;->a:I

    .line 36
    .line 37
    iget-object p1, p1, Lb7/g1;->c:Ljava/lang/Object;

    .line 38
    .line 39
    move-object v5, p1

    .line 40
    check-cast v5, Lb7/v1;

    .line 41
    .line 42
    iget-object p1, v4, Lb7/p1;->e:Lb7/k1;

    .line 43
    .line 44
    new-instance v1, Lb7/n1;

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    invoke-direct/range {v1 .. v6}, Lb7/n1;-><init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v1}, Lb7/k1;->execute(Ljava/lang/Runnable;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    return-void

    .line 54
    :pswitch_0
    check-cast p1, Landroid/graphics/Bitmap;

    .line 55
    .line 56
    iget-boolean v0, p0, Lb7/o;->d:Z

    .line 57
    .line 58
    if-nez v0, :cond_1

    .line 59
    .line 60
    iget-object v0, p0, Lb7/o;->b:Lm3/c;

    .line 61
    .line 62
    invoke-virtual {v0, p1}, Lm3/c;->d(Landroid/graphics/Bitmap;)V

    .line 63
    .line 64
    .line 65
    new-instance v6, Lb7/m;

    .line 66
    .line 67
    const/16 p1, 0x3e9

    .line 68
    .line 69
    invoke-virtual {v0}, Lm3/c;->a()Landroid/app/Notification;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-direct {v6, p1, v0}, Lb7/m;-><init>(ILandroid/app/Notification;)V

    .line 74
    .line 75
    .line 76
    iget-object p1, p0, Lb7/o;->c:Lb7/g1;

    .line 77
    .line 78
    iget-object v0, p1, Lb7/g1;->b:Ljava/lang/Object;

    .line 79
    .line 80
    move-object v4, v0

    .line 81
    check-cast v4, Lb7/p1;

    .line 82
    .line 83
    iget v2, p1, Lb7/g1;->a:I

    .line 84
    .line 85
    iget-object p1, p1, Lb7/g1;->c:Ljava/lang/Object;

    .line 86
    .line 87
    move-object v5, p1

    .line 88
    check-cast v5, Lb7/v1;

    .line 89
    .line 90
    iget-object p1, v4, Lb7/p1;->e:Lb7/k1;

    .line 91
    .line 92
    new-instance v1, Lb7/n1;

    .line 93
    .line 94
    const/4 v3, 0x0

    .line 95
    invoke-direct/range {v1 .. v6}, Lb7/n1;-><init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v1}, Lb7/k1;->execute(Ljava/lang/Runnable;)V

    .line 99
    .line 100
    .line 101
    :cond_1
    return-void

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 104
    .line 105
.end method

.method public final g(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget v0, p0, Lb7/o;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lb7/o;->d:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v1, "Failed to load bitmap: "

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const-string v0, "NotificationProvider"

    .line 29
    .line 30
    invoke-static {v0, p1}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void

    .line 34
    :pswitch_0
    iget-boolean v0, p0, Lb7/o;->d:Z

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v1, "Failed to load bitmap: "

    .line 41
    .line 42
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const-string v0, "NotificationProvider"

    .line 57
    .line 58
    invoke-static {v0, p1}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    return-void

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
