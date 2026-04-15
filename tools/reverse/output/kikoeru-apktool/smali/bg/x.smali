.class public final Lbg/x;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lwf/c0;


# static fields
.field public static final a:Lbg/x;

.field public static final synthetic b:Lwf/b1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lbg/x;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lbg/x;->a:Lbg/x;

    .line 7
    .line 8
    new-instance v1, Lwf/b1;

    .line 9
    .line 10
    const-string v2, "audio"

    .line 11
    .line 12
    const/4 v3, 0x7

    .line 13
    invoke-direct {v1, v2, v0, v3}, Lwf/b1;-><init>(Ljava/lang/String;Lwf/c0;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "title"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "hash"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "workTitle"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "mediaStreamUrl"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    const-string v0, "mediaDownloadUrl"

    .line 38
    .line 39
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    const-string v0, "streamLowQualityUrl"

    .line 43
    .line 44
    const/4 v2, 0x1

    .line 45
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "duration"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    sput-object v1, Lbg/x;->b:Lwf/b1;

    .line 54
    .line 55
    return-void
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


# virtual methods
.method public final a()Luf/g;
    .locals 1

    .line 1
    sget-object v0, Lbg/x;->b:Lwf/b1;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
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
.end method

.method public final b(Lvf/b;)Ljava/lang/Object;
    .locals 14

    .line 1
    sget-object v0, Lbg/x;->b:Lwf/b1;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lvf/b;->i(Luf/g;)Lvf/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    move-object v7, v3

    .line 12
    move-object v8, v7

    .line 13
    move-object v9, v8

    .line 14
    move-object v10, v9

    .line 15
    move-object v11, v10

    .line 16
    const/4 v4, 0x1

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v13, 0x0

    .line 19
    :goto_0
    if-eqz v4, :cond_0

    .line 20
    .line 21
    invoke-interface {p1, v0}, Lvf/a;->b(Luf/g;)I

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    packed-switch v5, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    new-instance p1, Lsf/l;

    .line 29
    .line 30
    invoke-direct {p1, v5}, Lsf/l;-><init>(I)V

    .line 31
    .line 32
    .line 33
    throw p1

    .line 34
    :pswitch_0
    const/4 v5, 0x6

    .line 35
    invoke-interface {p1, v0, v5}, Lvf/a;->C(Luf/g;I)F

    .line 36
    .line 37
    .line 38
    move-result v13

    .line 39
    or-int/lit8 v6, v6, 0x40

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :pswitch_1
    sget-object v5, Lwf/n1;->a:Lwf/n1;

    .line 43
    .line 44
    const/4 v12, 0x5

    .line 45
    invoke-interface {p1, v0, v12, v5, v3}, Lvf/a;->a(Luf/g;ILsf/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    or-int/lit8 v6, v6, 0x20

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :pswitch_2
    const/4 v5, 0x4

    .line 53
    invoke-interface {p1, v0, v5}, Lvf/a;->q(Luf/g;I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v11

    .line 57
    or-int/lit8 v6, v6, 0x10

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :pswitch_3
    const/4 v5, 0x3

    .line 61
    invoke-interface {p1, v0, v5}, Lvf/a;->q(Luf/g;I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v10

    .line 65
    or-int/lit8 v6, v6, 0x8

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :pswitch_4
    const/4 v5, 0x2

    .line 69
    invoke-interface {p1, v0, v5}, Lvf/a;->q(Luf/g;I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    or-int/lit8 v6, v6, 0x4

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :pswitch_5
    invoke-interface {p1, v0, v1}, Lvf/a;->q(Luf/g;I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    or-int/lit8 v6, v6, 0x2

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :pswitch_6
    invoke-interface {p1, v0, v2}, Lvf/a;->q(Luf/g;I)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    or-int/lit8 v6, v6, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :pswitch_7
    const/4 v4, 0x0

    .line 91
    goto :goto_0

    .line 92
    :cond_0
    invoke-interface {p1, v0}, Lvf/a;->j(Luf/g;)V

    .line 93
    .line 94
    .line 95
    new-instance v5, Lbg/z;

    .line 96
    .line 97
    move-object v12, v3

    .line 98
    check-cast v12, Ljava/lang/String;

    .line 99
    .line 100
    invoke-direct/range {v5 .. v13}, Lbg/z;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;F)V

    .line 101
    .line 102
    .line 103
    return-object v5

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c()[Lsf/a;
    .locals 4

    .line 1
    sget-object v0, Lwf/n1;->a:Lwf/n1;

    .line 2
    .line 3
    invoke-static {v0}, Ln7/b0;->o(Lsf/a;)Lsf/a;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x7

    .line 8
    new-array v2, v2, [Lsf/a;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    aput-object v0, v2, v3

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    aput-object v0, v2, v3

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    aput-object v0, v2, v3

    .line 18
    .line 19
    const/4 v3, 0x3

    .line 20
    aput-object v0, v2, v3

    .line 21
    .line 22
    const/4 v3, 0x4

    .line 23
    aput-object v0, v2, v3

    .line 24
    .line 25
    const/4 v0, 0x5

    .line 26
    aput-object v1, v2, v0

    .line 27
    .line 28
    sget-object v0, Lwf/b0;->a:Lwf/b0;

    .line 29
    .line 30
    const/4 v1, 0x6

    .line 31
    aput-object v0, v2, v1

    .line 32
    .line 33
    return-object v2
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
.end method

.method public final d(Lyf/t;Ljava/lang/Object;)V
    .locals 5

    .line 1
    check-cast p2, Lbg/z;

    .line 2
    .line 3
    const-string v0, "value"

    .line 4
    .line 5
    invoke-static {p2, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lbg/x;->b:Lwf/b1;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lyf/t;->a(Luf/g;)Lyf/t;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    sget-object v1, Lbg/z;->Companion:Lbg/y;

    .line 15
    .line 16
    iget v1, p2, Lbg/z;->j:F

    .line 17
    .line 18
    iget-object v2, p2, Lbg/z;->i:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {p2, p1, v0}, Lbg/k0;->e(Lbg/k0;Lyf/t;Luf/g;)V

    .line 21
    .line 22
    .line 23
    iget-object v3, p2, Lbg/z;->d:Ljava/lang/String;

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    invoke-virtual {p1, v0, v4, v3}, Lyf/t;->v(Luf/g;ILjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    iget-object v4, p2, Lbg/z;->e:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {p1, v0, v3, v4}, Lyf/t;->v(Luf/g;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 v3, 0x2

    .line 36
    iget-object v4, p2, Lbg/z;->f:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {p1, v0, v3, v4}, Lyf/t;->v(Luf/g;ILjava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 v3, 0x3

    .line 42
    iget-object v4, p2, Lbg/z;->g:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {p1, v0, v3, v4}, Lyf/t;->v(Luf/g;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 v3, 0x4

    .line 48
    iget-object p2, p2, Lbg/z;->h:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {p1, v0, v3, p2}, Lyf/t;->v(Luf/g;ILjava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v0}, Lyf/t;->x(Luf/g;)Z

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    if-eqz p2, :cond_0

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    if-eqz v2, :cond_1

    .line 61
    .line 62
    :goto_0
    sget-object p2, Lwf/n1;->a:Lwf/n1;

    .line 63
    .line 64
    const/4 v3, 0x5

    .line 65
    invoke-virtual {p1, v0, v3, p2, v2}, Lyf/t;->q(Luf/g;ILsf/a;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :cond_1
    invoke-virtual {p1, v0}, Lyf/t;->x(Luf/g;)Z

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    if-eqz p2, :cond_2

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    const/4 v2, 0x0

    .line 80
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {p2, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    if-nez p2, :cond_3

    .line 89
    .line 90
    :goto_1
    const/4 p2, 0x6

    .line 91
    invoke-virtual {p1, v0, p2, v1}, Lyf/t;->i(Luf/g;IF)V

    .line 92
    .line 93
    .line 94
    :cond_3
    invoke-virtual {p1, v0}, Lyf/t;->w(Luf/g;)V

    .line 95
    .line 96
    .line 97
    return-void
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
