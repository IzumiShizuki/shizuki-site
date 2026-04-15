.class public final Lq2/q;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Li2/j0;

.field public final b:Lq2/d;

.field public final c:Lo/m;

.field public final d:Lo/g0;


# direct methods
.method public constructor <init>(Li2/j0;Lq2/d;Lo/y;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq2/q;->a:Li2/j0;

    .line 5
    .line 6
    iput-object p2, p0, Lq2/q;->b:Lq2/d;

    .line 7
    .line 8
    iput-object p3, p0, Lq2/q;->c:Lo/m;

    .line 9
    .line 10
    new-instance p1, Lo/g0;

    .line 11
    .line 12
    const/4 p2, 0x2

    .line 13
    invoke-direct {p1, p2}, Lo/g0;-><init>(I)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lq2/q;->d:Lo/g0;

    .line 17
    .line 18
    return-void
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
.method public final a()Lq2/o;
    .locals 5

    .line 1
    new-instance v0, Lq2/k;

    .line 2
    .line 3
    invoke-direct {v0}, Lq2/k;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lq2/o;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    iget-object v3, p0, Lq2/q;->b:Lq2/d;

    .line 10
    .line 11
    iget-object v4, p0, Lq2/q;->a:Li2/j0;

    .line 12
    .line 13
    invoke-direct {v1, v3, v2, v4, v0}, Lq2/o;-><init>(Lj1/p;ZLi2/j0;Lq2/k;)V

    .line 14
    .line 15
    .line 16
    return-object v1
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

.method public final b(Li2/j0;Lq2/k;)V
    .locals 13

    .line 1
    iget-object v0, p0, Lq2/q;->d:Lo/g0;

    .line 2
    .line 3
    iget-object v1, v0, Lo/g0;->a:[Ljava/lang/Object;

    .line 4
    .line 5
    iget v0, v0, Lo/g0;->b:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    :goto_0
    if-ge v3, v0, :cond_b

    .line 10
    .line 11
    aget-object v4, v1, v3

    .line 12
    .line 13
    check-cast v4, Lk1/b;

    .line 14
    .line 15
    iget-object v5, v4, Lk1/b;->h:Lo/z;

    .line 16
    .line 17
    iget-object v6, v4, Lk1/b;->c:Lj2/v;

    .line 18
    .line 19
    iget-object v4, v4, Lk1/b;->a:Li7/p2;

    .line 20
    .line 21
    invoke-virtual {p1}, Li2/j0;->x()Lq2/k;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    iget v8, p1, Li2/j0;->b:I

    .line 26
    .line 27
    const/4 v9, 0x0

    .line 28
    if-eqz p2, :cond_1

    .line 29
    .line 30
    sget-object v10, Lq2/t;->D:Lq2/w;

    .line 31
    .line 32
    iget-object v11, p2, Lq2/k;->a:Lo/k0;

    .line 33
    .line 34
    invoke-virtual {v11, v10}, Lo/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v10

    .line 38
    if-nez v10, :cond_0

    .line 39
    .line 40
    move-object v10, v9

    .line 41
    :cond_0
    check-cast v10, Lt2/g;

    .line 42
    .line 43
    if-eqz v10, :cond_1

    .line 44
    .line 45
    iget-object v10, v10, Lt2/g;->b:Ljava/lang/String;

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    move-object v10, v9

    .line 49
    :goto_1
    if-eqz v7, :cond_3

    .line 50
    .line 51
    sget-object v11, Lq2/t;->D:Lq2/w;

    .line 52
    .line 53
    iget-object v12, v7, Lq2/k;->a:Lo/k0;

    .line 54
    .line 55
    invoke-virtual {v12, v11}, Lo/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v11

    .line 59
    if-nez v11, :cond_2

    .line 60
    .line 61
    move-object v11, v9

    .line 62
    :cond_2
    check-cast v11, Lt2/g;

    .line 63
    .line 64
    if-eqz v11, :cond_3

    .line 65
    .line 66
    iget-object v9, v11, Lt2/g;->b:Ljava/lang/String;

    .line 67
    .line 68
    :cond_3
    const/4 v11, 0x1

    .line 69
    if-eq v10, v9, :cond_6

    .line 70
    .line 71
    if-nez v10, :cond_4

    .line 72
    .line 73
    invoke-virtual {v4, v6, v8, v11}, Li7/p2;->C(Landroid/view/View;IZ)V

    .line 74
    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_4
    if-nez v9, :cond_5

    .line 78
    .line 79
    invoke-virtual {v4, v6, v8, v2}, Li7/p2;->C(Landroid/view/View;IZ)V

    .line 80
    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_5
    sget-object v10, Lq2/t;->r:Lq2/w;

    .line 84
    .line 85
    invoke-static {v7, v10}, Lq2/r;->d(Lq2/k;Lq2/w;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v10

    .line 89
    check-cast v10, Lk1/c;

    .line 90
    .line 91
    sget-object v12, Lk1/l;->a:Lk1/c;

    .line 92
    .line 93
    invoke-static {v10, v12}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v10

    .line 97
    if-eqz v10, :cond_6

    .line 98
    .line 99
    invoke-virtual {v9}, Ljava/lang/String;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v9

    .line 103
    invoke-static {v9}, Lb7/l;->k(Ljava/lang/String;)Landroid/view/autofill/AutofillValue;

    .line 104
    .line 105
    .line 106
    move-result-object v9

    .line 107
    iget-object v4, v4, Li7/p2;->a:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v4, Landroid/view/autofill/AutofillManager;

    .line 110
    .line 111
    invoke-static {v4, v6, v8, v9}, Lk1/g;->w(Landroid/view/autofill/AutofillManager;Lj2/v;ILandroid/view/autofill/AutofillValue;)V

    .line 112
    .line 113
    .line 114
    :cond_6
    :goto_2
    if-eqz p2, :cond_7

    .line 115
    .line 116
    iget-object v4, p2, Lq2/k;->a:Lo/k0;

    .line 117
    .line 118
    sget-object v6, Lq2/t;->q:Lq2/w;

    .line 119
    .line 120
    invoke-virtual {v4, v6}, Lo/k0;->b(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    if-ne v4, v11, :cond_7

    .line 125
    .line 126
    const/4 v4, 0x1

    .line 127
    goto :goto_3

    .line 128
    :cond_7
    const/4 v4, 0x0

    .line 129
    :goto_3
    if-eqz v7, :cond_8

    .line 130
    .line 131
    iget-object v6, v7, Lq2/k;->a:Lo/k0;

    .line 132
    .line 133
    sget-object v7, Lq2/t;->q:Lq2/w;

    .line 134
    .line 135
    invoke-virtual {v6, v7}, Lo/k0;->b(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    if-ne v6, v11, :cond_8

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_8
    const/4 v11, 0x0

    .line 143
    :goto_4
    if-eq v4, v11, :cond_a

    .line 144
    .line 145
    if-eqz v11, :cond_9

    .line 146
    .line 147
    invoke-virtual {v5, v8}, Lo/z;->a(I)Z

    .line 148
    .line 149
    .line 150
    goto :goto_5

    .line 151
    :cond_9
    invoke-virtual {v5, v8}, Lo/z;->e(I)Z

    .line 152
    .line 153
    .line 154
    :cond_a
    :goto_5
    add-int/lit8 v3, v3, 0x1

    .line 155
    .line 156
    goto/16 :goto_0

    .line 157
    .line 158
    :cond_b
    return-void
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
