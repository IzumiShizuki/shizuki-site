.class public final Lb7/z0;
.super Landroid/os/ResultReceiver;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lb7/z0;->a:I

    invoke-direct {p0, p1}, Landroid/os/ResultReceiver;-><init>(Landroid/os/Handler;)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;Lcb/e0;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lb7/z0;->a:I

    .line 2
    iput-object p2, p0, Lb7/z0;->b:Ljava/lang/Object;

    invoke-direct {p0, p1}, Landroid/os/ResultReceiver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public final onReceiveResult(ILandroid/os/Bundle;)V
    .locals 5

    .line 1
    iget v0, p0, Lb7/z0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lb7/z0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lc7/j0;

    .line 15
    .line 16
    if-eqz p1, :cond_3

    .line 17
    .line 18
    if-nez p2, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    iget-object v0, p1, Lc7/j0;->b:Ljava/lang/Object;

    .line 22
    .line 23
    monitor-enter v0

    .line 24
    :try_start_0
    iget-object v1, p1, Lc7/j0;->e:Lc7/d1;

    .line 25
    .line 26
    const-string v2, "android.support.v4.media.session.EXTRA_BINDER"

    .line 27
    .line 28
    invoke-virtual {p2, v2}, Landroid/os/Bundle;->getBinder(Ljava/lang/String;)Landroid/os/IBinder;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    sget v3, Lc7/v0;->f:I

    .line 33
    .line 34
    if-nez v2, :cond_1

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const-string v3, "android.support.v4.media.session.IMediaSession"

    .line 39
    .line 40
    invoke-interface {v2, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    if-eqz v3, :cond_2

    .line 45
    .line 46
    instance-of v4, v3, Lc7/h;

    .line 47
    .line 48
    if-eqz v4, :cond_2

    .line 49
    .line 50
    move-object v2, v3

    .line 51
    check-cast v2, Lc7/h;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    new-instance v3, Lc7/g;

    .line 55
    .line 56
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object v2, v3, Lc7/g;->e:Landroid/os/IBinder;

    .line 60
    .line 61
    move-object v2, v3

    .line 62
    :goto_0
    invoke-virtual {v1, v2}, Lc7/d1;->b(Lc7/h;)V

    .line 63
    .line 64
    .line 65
    iget-object v1, p1, Lc7/j0;->e:Lc7/d1;

    .line 66
    .line 67
    invoke-static {p2}, Lg8/a;->N(Landroid/os/Bundle;)Lg8/d;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    invoke-virtual {v1, p2}, Lc7/d1;->c(Lg8/d;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Lc7/j0;->a()V

    .line 75
    .line 76
    .line 77
    monitor-exit v0

    .line 78
    goto :goto_1

    .line 79
    :catchall_0
    move-exception p1

    .line 80
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    throw p1

    .line 82
    :cond_3
    :goto_1
    return-void

    .line 83
    :pswitch_0
    iget-object v0, p0, Lb7/z0;->b:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, Lcb/e0;

    .line 86
    .line 87
    new-instance v1, Lb7/i4;

    .line 88
    .line 89
    if-nez p2, :cond_4

    .line 90
    .line 91
    sget-object p2, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 92
    .line 93
    :cond_4
    invoke-direct {v1, p1, p2}, Lb7/i4;-><init>(ILandroid/os/Bundle;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v1}, Lcb/p;->k(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method
